package org.learjava.a2z.operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        int marks = 35;
        int passMarks = 40;
        String result = "";
        if (marks >= passMarks) {
            result = "PASS";
        } else {
            result = "FAIL";
        }
        System.out.println(result);

        result = marks>=passMarks ? "PASS" : "FAIL";
        System.out.println(result);
    }
}
