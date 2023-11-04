package org.learjava.a2z.fundamentals.arrays;

public class Arrays2DBasicOperations {
    public static void main(String[] args) {
        int[][] twoDimensionArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        //Always number of rows length
        System.out.println(twoDimensionArray.length);
        //first row length
        System.out.println(twoDimensionArray[0].length);
        //second row length
        System.out.println(twoDimensionArray[1].length);
        //third row length
        System.out.println(twoDimensionArray[2].length);
        // Find last element in second row
        System.out.println(twoDimensionArray[1][3]);
        // Print elements in array (Wrong way)
        System.out.println(twoDimensionArray);
        // Print elements in array (Right way)
        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray[i].length; j++) {
                System.out.print(twoDimensionArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
