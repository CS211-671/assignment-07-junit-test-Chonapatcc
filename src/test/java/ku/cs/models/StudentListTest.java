package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent() {
        StudentList studentList = new StudentList();
        int oldSize = studentList.getStudents().size();
        studentList.addNewStudent("1", "cat");
        int newSize = studentList.getStudents().size();
        assertEquals(oldSize + 1, newSize);
    }

    @Test
    void testFindAndAdd() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "cat");
        Student student = studentList.findStudentById("1");
        assertEquals(student.getName(), "cat");

    }

    @Test
    void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "cat");
        studentList.giveScoreToId("1",100);
        Student student = studentList.findStudentById("1");
        assertEquals(student.getScore(),100);
    }

    @Test
    void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "cat");
        studentList.giveScoreToId("1",100);
        String grade = studentList.viewGradeOfId("1");
        assertEquals(grade, "A");
    }

    @Test
    void testGetStudents() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "cat");
        assertNotNull(studentList);
    }
}