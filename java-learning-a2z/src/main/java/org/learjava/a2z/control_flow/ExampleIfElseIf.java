package org.learjava.a2z.control_flow;

public class ExampleIfElseIf {
    public static void main(String[] args) {
        int testScore = 35;
        int graceMarks = 5;
        int passMarks = 40;
        if (testScore >= passMarks) {
            System.out.println("You passed the exam!");
        } else if ((testScore + graceMarks) >= passMarks) {
            System.out.println("You passed the exam with grace marks!");
        } else {
            System.out.println("You failed the exam!");
        }
    }
}
