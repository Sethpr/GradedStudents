package io.zipcoder;

import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    Double[] scores;
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = examScores;
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

    public String getExamScores() {
        StringBuilder examScores = new StringBuilder();
        examScores.append("Exam Scores:\n");
        for (int i = 0; i < scores.length; i++) {
            examScores.append("\tExam ").append(i+1).append(": ").append(scores[i]).append("\n");
        }
        return String.valueOf(examScores);
    }

    public int getNumberOfExamsTaken(){
        return scores.length;
    }

    public void addExamScore(double score) {
        Double[] newScores = Arrays.copyOf(scores, scores.length +1);
        newScores[newScores.length-1] = score;
        scores = newScores;
    }

    public void setExamScore(int exam, double score) {
        scores[exam-1] = score;
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for(Double d: scores){
            sum+=d;
        }
        return sum/scores.length;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Student Name: ").append(getFirstName()).append(" ").append(getLastName()).append("\n");
        str.append("> Average Score: ").append(getAverageExamScore()).append("\n");
        str.append("> ").append(getExamScores());

        return String.valueOf(str);
    }
}
