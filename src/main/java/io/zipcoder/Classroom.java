package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    ArrayList<Student> students;
    int maxNumStudents;
    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }
    public Classroom(int maxNumStudents){
        this.maxNumStudents = maxNumStudents;
        this.students = new ArrayList<>();
    }
    public Classroom(){
        this.students = new ArrayList<>();
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for(Student i : students){
            sum += i.getAverageExamScore();
        }
        return sum / students.size();
    }

    public void addStudent(Student student) {
        if(students.size() < maxNumStudents) {
            students.add(student);
        }
    }
}
