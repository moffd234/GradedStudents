package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
 
import java.util.*;

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

    @Test
    public void testAddStudent(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        String preEnrollment = classroom.getStudents().toString();
        classroom.addStudent(student);
        String postEnrollment = classroom.getStudents().toString();

        // Then
        Assert.assertNotEquals(preEnrollment, postEnrollment);
    }

    @Test
    public void testRemoveStudent(){
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<>(Arrays.asList(100.0, 150.0));
        ArrayList<Double> s2Scores = new ArrayList<>(Arrays.asList(225.0, 25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(s1,s2));
        Classroom classroom = new Classroom(students);
        Integer expectedOutput = classroom.getStudents().size() - 1;

        // When
        classroom.removeStudent("student", "one");
        ArrayList<Student> studentsAfterRemoval = classroom.getStudents();
        Integer output = studentsAfterRemoval.size();
        // Then
        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void testGetStudentsByScore(){
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<>(Arrays.asList(100.0, 150.0));
        ArrayList<Double> s2Scores = new ArrayList<>(Arrays.asList(225.0, 205.0));
        ArrayList<Double> s3Scores = new ArrayList<>(Arrays.asList(250.0, 250.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3));
        Classroom classroom = new Classroom(students);

        ArrayList<Student> expected = new ArrayList<>(Arrays.asList(s3, s2, s1));


        // When
        ArrayList<Student> output = classroom.getStudentByScore();
        System.out.println(output);

        Assert.assertEquals(expected.toString(), output.toString());
    }

    @Test
    public void testGetPercentile(){
        Classroom classroom = new Classroom();

        Double expected = 33.33;

        //When
        Double actual = classroom.calcPercentile(0, 3);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPercentile1(){
        Classroom classroom = new Classroom();

        Double expected = 66.67; // Due to rounding this should be 66.67

        //When
        Double actual = classroom.calcPercentile(1, 3);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetPercentile2(){
        Classroom classroom = new Classroom();

        Double expected = 100.00;

        //When
        Double actual = classroom.calcPercentile(2, 3);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLetter(){

        // Given
        Classroom classroom = new Classroom();

        char expected1 = 'A';
        char expected2 = 'B';
        char expected3 = 'C';
        char expected4 = 'D';
        char expected5 = 'F';

        // When
        char output1 = classroom.getLetter(90);
        char output2 = classroom.getLetter(80);
        char output3 = classroom.getLetter(55);
        char output4 = classroom.getLetter(12);
        char output5 = classroom.getLetter(9);

        // Then
        Assert.assertEquals(expected1, output1);
        Assert.assertEquals(expected2, output2);
        Assert.assertEquals(expected3, output3);
        Assert.assertEquals(expected4, output4);
        Assert.assertEquals(expected5, output5);

    }
}
