package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void testGetAverageExamScore(){
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<>(Arrays.asList(100.0, 150.0));
        ArrayList<Double> s2Scores = new ArrayList<>(Arrays.asList(225.0, 25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(s1,s2));
        Classroom classroom = new Classroom(students);

        Double expectedAvg = (s1.getAverageExamScore() + s2.getAverageExamScore()) / 2;


        // When
        Double output = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(expectedAvg, output);
    }
}
