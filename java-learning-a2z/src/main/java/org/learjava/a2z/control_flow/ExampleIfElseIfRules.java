package org.learjava.a2z.control_flow;

public class ExampleIfElseIfRules {
    /*Rule 1 : curly braces "{ }" are optional if only
               single statement after if or else
    Rule 2 : statement should not be declarative statement*/
    public static void main(String[] args) {
        int testScore = 35;
        int graceMarks = 5;
        int passMarks = 40;
        if (testScore >= passMarks)
            System.out.println("You passed the exam!");
        else if ((testScore + graceMarks) >= passMarks)
            System.out.println("You passed the exam with grace marks!");
        else
            System.out.println("You failed the exam!");
    }
}
