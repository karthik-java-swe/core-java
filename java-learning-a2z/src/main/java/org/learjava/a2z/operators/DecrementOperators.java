package org.learjava.a2z.operators;

public class DecrementOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = a--;
        System.out.println("prefix decrement");
        System.out.println("a :: " + a);
        System.out.println("b :: " + b);

        int x = 10;
        int y = --x;
        System.out.println("postfix decrement");
        System.out.println("x :: " + x);
        System.out.println("y :: " + y);
    }
}
