package org.learjava.a2z.new_features;

import java.util.List;

public class FunctionalProgrammingRefactoredMoreExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printSquaresOfAllNumbers(numbers);
        printCubesOfOddNumbers(numbers);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        System.out.println("printing cubes of all odd numbers");
        numbers.stream()
                .map(i -> i * i * i)
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);
    }

    private static void printSquaresOfAllNumbers(List<Integer> numbers) {
        System.out.println("printing squares of all numbers");
        numbers.stream()
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
