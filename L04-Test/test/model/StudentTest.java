package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class StudentTest {

    @Test
    void averageGrade() {
        //arrange
        Student student = new Student("Karsten Bang", 22);
        student.addGrade(2);
        student.addGrade(12);
        student.addGrade(7);
        //act
        double expected = student.averageGrade();
        //assert
        assertEquals(expected, 7.0, 0.0001);
    }
}