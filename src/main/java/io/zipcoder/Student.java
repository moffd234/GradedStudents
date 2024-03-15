package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores(){
        return examScores.toString();
    }

    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void addExamScore(double v) {
        examScores.add(v);
    }

    public void setExamScore(int i, double v) {
        examScores.set(i, v);
    }
}
