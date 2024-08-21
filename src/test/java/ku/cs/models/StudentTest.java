package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        String newName = "cat";
        s.changeName(newName);
        assertEquals(newName, s.getName());
    }

    @Test
    void testToString() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        String textToCheck = "{" +
                "id: '" + s.getId() + '\'' +
                ", name: '" + s.getName() + '\'' +
                ", score: " + s.getScore() +
                '}';
        assertEquals(textToCheck, s.toString());
    }
}