package org.learjava.a2z.warmup;

public class MatrixPattern4 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int i,j;
        int n = matrix.length;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
