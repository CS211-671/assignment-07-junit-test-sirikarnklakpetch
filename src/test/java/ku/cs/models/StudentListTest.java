package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentListTest {

    @Test
    public void testFindStudentById() {
        StudentList StdLs = new StudentList();
        StdLs.addNewStudent("66123456789" , "Aom");
        StdLs.addNewStudent("66123456780" , "Hanah");
        StdLs.addNewStudent("66123456701" , "AomSin");

        Student FindStd = StdLs.findStudentById("66123456789");

        String expected = "Aom";
        String actual = FindStd.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void giveScoreToId() {
        StudentList StdLs = new StudentList();
        StdLs.addNewStudent("66123456789" , "Aom",0);
        StdLs.addNewStudent("66123456780" , "Hanah");
        StdLs.addNewStudent("66123456701" , "AomSin");

        StdLs.giveScoreToId("66123456789",30);

        Student Std = StdLs.findStudentById("66123456789");

        double actual = Std.getScore();
        double expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    public void testViewGradeOfId() {
        StudentList StdLs = new StudentList();
        StdLs.addNewStudent("66123456789" , "Aom",85);
        StdLs.addNewStudent("66123456780" , "Hanah");
        StdLs.addNewStudent("66123456701" , "AomSin");

        String actual = StdLs.viewGradeOfId("66123456789");

        String expected = "A";
        assertEquals(expected, actual);
    }

}