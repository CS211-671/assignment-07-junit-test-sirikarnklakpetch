package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1 ;

    @BeforeEach
    void init() {
        s1 = new Student("66123456789" , "Aom");
    }

    @Test
    void testADDScore(){
//        Student s1 = new Student("66123456789" , "Aom");
        s1.addScore(40);
        assertEquals(40,s1.getScore());
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }

    @Test
    void testCalculateGrade() {
//        Student s1 = new Student("66123456789" , "Aom",50);
        s1.addScore(10);
        assertEquals("C",s1.grade());
    }

}