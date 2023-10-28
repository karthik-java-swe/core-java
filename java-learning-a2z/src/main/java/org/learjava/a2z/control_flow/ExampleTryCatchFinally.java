package org.learjava.a2z.control_flow;

public class ExampleTryCatchFinally {
    public static void main(String[] args) {
        int numerator = 100;
        int denominator = 0;
        try {
            System.out.println("result :: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("division by 0 is not possible");
        } finally {
            System.out.println("I am executed if exception occurred or not");
        }
    }
}
