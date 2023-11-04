package org.learjava.a2z.fundamentals.casting;

class ImplicitTypeCasting {
    public static void main(String[] args) {
        int i = 100;

        //automatic(implicit) type conversion
        long l = i;

        //automatic(implicit) type conversion
        float f = l;
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
    }
}