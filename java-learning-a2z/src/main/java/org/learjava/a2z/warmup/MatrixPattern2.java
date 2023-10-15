package org.learjava.a2z.warmup;

public class MatrixPattern2 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
