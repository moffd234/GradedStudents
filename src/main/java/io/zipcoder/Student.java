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

    public Double getAverageExamScore() {
        double sum = 0;
        for(double i : examScores){
            sum += i;
        }
        return sum / getNumberOfExamsTaken();
    }
    @Override
    public String toString(){
        String output = "Student Name: " + firstName + " " + lastName + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n" +
                "> Exam Scores:\n";
        for(int i = 0; i < examScores.size(); i++){
            output += "\t\tExam " + (i + 1) + " -> " + examScores.get(i) + "\n";
        }
        return output;
    }
}
