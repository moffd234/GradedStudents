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

    

}