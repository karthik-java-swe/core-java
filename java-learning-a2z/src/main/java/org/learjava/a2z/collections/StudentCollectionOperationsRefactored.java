package org.learjava.a2z.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCollectionOperationsRefactored {
    public static void main(String[] args) {
        List<Student> studentList = initStudentDetails();
        System.out.println(studentList);

        updateStudentGrades(studentList);
        System.out.println(studentList);

        sortStudentsBasedOnNames(studentList);
        System.out.println(studentList);
    }

    private static void sortStudentsBasedOnNames(List<Student> studentList) {
        Collections.sort(studentList,(Comparator.comparing(Student::getStudentName)));
    }

    private static void updateStudentGrades(List<Student> studentList) {
        for(Student student : studentList){
            if(student.getMarks()>=70){
                student.setGrade("A");
            } else if(student.getMarks()>=60){
                student.setGrade("B");
            } else {
                student.setGrade("C");
            }
        }
    }

    private static List<Student> initStudentDetails() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"James",65,null));
        studentList.add(new Student(2,"Richard",90,null));
        studentList.add(new Student(3,"Gary",50,null));
        return studentList;
    }
}
