package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {
    @Test
    public void getExamScores(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(output, examScores.toString());
    }

    @Test
    public void testAddExamScore(){
    // : Given
    String firstName = "Leon";
    String lastName = "Hunter";
    ArrayList<Double> examScores = new ArrayList<>();
    Student student = new Student(firstName, lastName, examScores);

    // When
    student.addExamScore(100.0);
    String output = student.getExamScores();

    // Then
    Assert.assertEquals(output, examScores.toString());
    }

    @Test
    public void testSetExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(0, 150.0);
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(output, examScores.toString());
    }

    @Test
    public void testGetAverageExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();

        // Then
        Assert.assertEquals((Double)125.0, output);
    }

    @Test
    public void testToString(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        Student student = new Student(firstName, lastName, examScores);
        String expectedOutput = "Student Name: Leon Hunter\n" +
                "> Average Score: 125.0\n" +
                "> Exam Scores:\n"+
                "\t\tExam 1 -> 100.0\n"+
                "\t\tExam 2 -> 150.0\n"+
                "\t\tExam 3 -> 250.0\n"+
                "\t\tExam 4 -> 0.0\n";
        // When
        String output = student.toString();
        // Then
        Assert.assertEquals(expectedOutput, output);
    }

}