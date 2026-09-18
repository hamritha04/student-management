pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/hamritha04/student-management.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t student-management:1.0 .'
            }
        }

        stage('Deploy') {
            steps {
                bat 'docker stop student-management-container || exit 0'
                bat 'docker rm student-management-container || exit 0'
                bat 'docker run -d --name student-management-container -p 8080:8080 student-management:1.0'
            }
        }
    }
}