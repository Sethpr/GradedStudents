package io.zipcoder;

import java.util.ArrayList;

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

    public Student[] getStudentByScore(double score) { //come back and sort this
        ArrayList<Student> s = new ArrayList<>();
        for(Student stu: students){
            if(stu != null) {
                if (stu.getAverageExamScore() == score) {
                    s.add(stu);
                }
            }
        }
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
}
