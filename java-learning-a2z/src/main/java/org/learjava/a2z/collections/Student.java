package org.learjava.a2z.collections;

import java.util.StringJoiner;

public class Student {
    private int studentId;
    private String studentName;
    private double marks;
    private String grade;

    public Student(int studentId, String studentName, double marks, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("studentId=" + studentId)
                .add("studentName='" + studentName + "'")
                .add("marks=" + marks)
                .add("grade='" + grade + "'")
                .toString();
    }
}
