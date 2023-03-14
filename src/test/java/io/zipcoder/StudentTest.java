package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n" +
                "\tExam 1: 100.0\n" +
                "\tExam 2: 95.0\n" +
                "\tExam 3: 123.0\n" +
                "\tExam 4: 96.0\n";

        // When
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(expected,output);
    }

    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n\tExam 1: 100.0\n";
        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(expected,output);

    }

    @Test
    public void testSetExamScore() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n\tExam 1: 150.0\n";

        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(expected,output);
    }

    @Test
    public void testGetAverage() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        Double expected = 125.0;

        // When
        Double output = student.getAverageExamScore();

        // Then
        Assert.assertEquals(expected,output);
    }

    @Test
    public void testToString() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Student Name: Leon Hunter\n> Average Score: 125.0\n> Exam Scores:\n" +
                "\tExam 1: 100.0\n" +
                "\tExam 2: 150.0\n" +
                "\tExam 3: 250.0\n" +
                "\tExam 4: 0.0\n";

        // When
        String output = student.toString();

        // Then
        Assert.assertEquals(expected,output);
    }
}