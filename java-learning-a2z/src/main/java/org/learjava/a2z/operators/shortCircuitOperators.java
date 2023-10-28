package org.learjava.a2z.operators;

public class shortCircuitOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > 5 && b < 10) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }
        System.out.println("=====");
        int x = 10;
        int y = 5;
        if (x > 5 || y > 10) {
            System.out.println("At least one condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }
    }
}
