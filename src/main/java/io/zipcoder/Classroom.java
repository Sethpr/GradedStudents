package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Classroom {
    Student[] students;

    public Classroom(){
        students = new Student[30];
    }

    public Classroom(int maxStudents){
        students = new Student[maxStudents];
    }

    public Classroom(int maxStudents, Student... student){
        students = new Student[maxStudents];
        int counter = 0;
        for(Student s: student){
            students[counter] = s;
            counter++;
        }
    }

    public Student[] getStudentByScore(double score) {
        ArrayList<Student> s = new ArrayList<>();
        for(Student stu: students){
            if(stu != null) {
                if (stu.getAverageExamScore() == score) {
                    s.add(stu);
                }
            }
        }
        Collections.sort(s);
        return s.toArray(new Student[0]);
    }

    public double getAverageExamScore() {
        double sum = 0.0;
        for(Student s : students){
            sum+= s.getAverageExamScore();
        }
        return sum/students.length;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                students[i] = student;
                return;
            }
        }
        System.out.println("Error, class is full");
    }

    public void removeStudent(String firstName, String lastName) {
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            counter++;
            if(students[i].getLastName().equals(lastName) && students[i].getFirstName().equals(firstName)){
                students[i] = null;
                break;
            }
        }
        for (int i = counter-1; i < students.length-1; i++) {
            students[i] = students[i+1];
        }
        students[students.length -1] = null;
    }
}
