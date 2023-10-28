package org.learjava.a2z.operators;

public class IncrementOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println("prefix increment");
        System.out.println("a :: " + a);
        System.out.println("b :: " + b);

        int x = 10;
        int y = ++x;
        System.out.println("postfix increment");
        System.out.println("x :: " + x);
        System.out.println("y :: " + y);
    }
}
