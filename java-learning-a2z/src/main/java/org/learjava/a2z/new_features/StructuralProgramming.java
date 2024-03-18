package org.learjava.a2z.new_features;

import java.util.List;

public class StructuralProgramming {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        System.out.println("Printing all numbers in list");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("Printing all even numbers in list");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
