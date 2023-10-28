package org.learjava.a2z.control_flow;

public class ExampleContinueWhile {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        while (number >= 1) {
            if (number == 5) {
                number--;
                continue;
            }
            sum += number;
            number--;
        }
        System.out.println("sum :: " + sum);
    }
}
