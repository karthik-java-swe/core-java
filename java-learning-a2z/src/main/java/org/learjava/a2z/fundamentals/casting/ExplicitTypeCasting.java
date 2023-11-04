package org.learjava.a2z.fundamentals.casting;

class ExplicitTypeCasting {
    public static void main(String[] args) {
        double d = 100.04;

        //explicit type casting(Narrowing)
        long l = (long) d;

        //explicit type casting(Narrowing)
        int i = (int) l;
        System.out.println("Double value " + d);

        //fractional part lost
        System.out.println("Long value " + l);

        //fractional part lost
        System.out.println("Int value " + i);
    }
}