package org.learjava.a2z.fundamentals.arrays;

public class ArraysBasicOperations {
    public static void main(String[] args) {
        int[] inputArray = {1, 5, 18, 3, 7, 9, 23, 5, 11, 2};
        // Find array length/size
        System.out.println(inputArray.length);
        // Find element at index 5
        System.out.println(inputArray[5]);
        // Find last element in array
        System.out.println(inputArray[inputArray.length - 1]);
        // Print elements in array (Wrong way)
        System.out.println(inputArray);
        // Print elements in array
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(i + " ");
        }
        // Print elements in array enhanced for loop
        System.out.println("\nUsing enhanced for loop");
        for (int i : inputArray) {
            System.out.print(i + " ");
        }
    }
}
