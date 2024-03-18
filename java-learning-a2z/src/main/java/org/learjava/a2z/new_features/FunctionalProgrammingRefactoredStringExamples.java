package org.learjava.a2z.new_features;

import java.util.List;

public class FunctionalProgrammingRefactoredStringExamples {
    public static void main(String[] args) {
        List<String> javaTopics = List.of("Exception Handling", "Files", "Threads", "Collections", "JVM", "Garbage Collection", "OOPS");

        printAllJavaTopics(javaTopics);
        printLengthOfEachTopic(javaTopics);
        printSingleWordTopicsWithGivenLength(javaTopics);
    }

    private static void printSingleWordTopicsWithGivenLength(List<String> javaTopics) {
        System.out.println("Printing single word topic with length greater than 5");
        javaTopics.stream()
                .filter(s -> s.length() > 5)
                .filter(s -> !s.contains(" "))
                .map(s -> s + " " + s.length())
                .forEach(System.out::println);
    }

    private static void printLengthOfEachTopic(List<String> javaTopics) {
        System.out.println("Printing length of each java topic");
        javaTopics.stream()
                .map(s -> s + " " + s.length())
                .forEach(System.out::println);
    }

    private static void printAllJavaTopics(List<String> javaTopics) {
        System.out.println("Printing all java topics");
        javaTopics.stream()
                .forEach(System.out::println);
    }
}
