package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void testGetStudentByScore() {
        Student[] expected = new Student[1];
        expected[0] = new Student("John", "Doe", new Double[]{100.0});
        Classroom c = new Classroom(1, expected[0]);

        Student[] actual = c.getStudentByScore(100.0);

        Assert.assertEquals(expected[0],actual[0]);
    }

    @Test
    public void testGetAverageExamScore() {
        double expected = 100.0;
        Student s1 = new Student(null, null, new Double[]{150.0});
        Student s2 = new Student(null, null, new Double[]{100.0});
        Student s3 = new Student(null, null, new Double[]{50.0});
        Classroom c = new Classroom(3, s1, s2, s3);

        double actual = c.getAverageExamScore();

        Assert.assertEquals(expected, actual, .02);
    }

    @Test
    public void testGetStudents() {
        Student s1 = new Student(null, null, new Double[]{150.0});
        Student s2 = new Student(null, null, new Double[]{100.0});
        Student s3 = new Student(null, null, new Double[]{50.0});
        Classroom c = new Classroom(3, s1, s2, s3);

        Student[] actual = c.getStudents();

        Assert.assertEquals(actual[0], s1);
        Assert.assertEquals(actual[1], s2);
        Assert.assertEquals(actual[2], s3);
    }

    @Test
    public void testAddStudent() {
        Student s1 = new Student(null, null, new Double[]{150.0});
        Student s2 = new Student(null, null, new Double[]{100.0});
        Classroom c = new Classroom(3, s1);

        c.addStudent(s2);
        Student actual = c.getStudentByScore(100.0)[0];

        Assert.assertEquals(s2, actual);
    }

    @Test
    public void testRemoveStudent() {
        Student s1 = new Student("Corey", "Mattox", new Double[]{150.0});
        Student s2 = new Student("Reginald", "Schmidt", new Double[]{100.0});
        Student s3 = new Student("Blake", "Urban", new Double[]{50.0});
        Classroom c = new Classroom(5, s1, s2, s3);

        c.removeStudent("Reginald", "Schmidt");
        Student[] actual = c.getStudents();

        Assert.assertEquals(s3, actual[1]);
    }
}
