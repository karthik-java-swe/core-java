package org.learjava.a2z.new_features;

import java.util.List;

public class FunctionalProgrammingRefactored {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInList(numbers);
        printAllEvenNumbersInList(numbers);
        printAllOddNumbersInList(numbers);
    }

    private static void printAllEvenNumbersInList(List<Integer> numbers) {
        System.out.println("Printing all even numbers in list");
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printAllOddNumbersInList(List<Integer> numbers) {
        System.out.println("Printing all odd numbers in list");
        numbers.stream()
                .filter(i->i%2==1)
                .forEach(System.out::println);
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        System.out.println("Printing all numbers in list");
        numbers.stream().
                forEach(System.out::println);
    }
}
