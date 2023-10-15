package org.learjava.a2z.warmup;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum1 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println("sum1 :: " + sum1);

        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("sum2 :: " + sum2);

        int sum3 = 0;
        int count = 1;
        while (count <= n) {
            sum3 = sum3 + count;
            count++;
        }
        System.out.println("sum3 :: " + sum3);
    }
}
