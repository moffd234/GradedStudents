package io.zipcoder;

import java.util.*;

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

    public void removeStudent(String fName, String lName) {
        students.removeIf(s -> Objects.equals(s.getFirstName(), fName) && Objects.equals(s.getLastName(), lName));
    }

    ArrayList<Student> getStudentByScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageExamScore).reversed());
        return students;
    }


    public Map<Student, Character> getGradeBook(){

        Map<Student, Character> gradeBook = new LinkedHashMap<>();
        ArrayList<Student> studentList = getStudentByScore();


        for(int i = studentList.size() - 1; i >= 0; i--){
            double percentile = calcPercentile(i, studentList.size());  // Get the percentile
            char letterGrade = getLetter(percentile); // Get the letter grade corresponding to the percentile
            gradeBook.put(studentList.get(i), letterGrade); // Add to the gradeBook
        }

            return gradeBook;
    }

    public char getLetter(double percentile){
        if(percentile >= 90.0){
            return 'A';
        }
        if(percentile >= 71.0){
            return 'B';
        }
        if(percentile >= 50.0){
            return 'C';
        }
        if(percentile >= 11.0){
            return 'D';
        }
       return 'F';
    }
    public double calcPercentile(int index, int length){
        // p = n/N * 100
        index ++;

        double percentile = (double) index /length * 100.0;
        return Math.round(percentile*100.0) / 100.0;
    }

}
