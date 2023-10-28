package org.learjava.a2z.operators;

public class EqualityOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 30;
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a != c);
        System.out.println("=====");
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3 = t1;
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
