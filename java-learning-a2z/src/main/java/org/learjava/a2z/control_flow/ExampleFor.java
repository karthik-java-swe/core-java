package org.learjava.a2z.control_flow;

public class ExampleFor {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("sum :: " + sum);
    }
}
