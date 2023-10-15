package org.learjava.a2z.warmup;

public class PrintMatrixIndices {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        //Print matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //Print indices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
    }
}
