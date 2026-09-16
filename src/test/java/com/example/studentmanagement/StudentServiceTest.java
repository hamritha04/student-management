package com.example.studentmanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testAddStudent() {

        StudentService service = new StudentService();

        Student student = new Student(1, "Rahul", "CSE");

        Student result = service.addStudent(student);

        assertEquals(1, result.getId());
        assertEquals("Rahul", result.getName());
        assertEquals("CSE", result.getDepartment());
    }
}