package org.learjava.a2z.control_flow;

public class ExampleContinueFor {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if(i==5){
                continue;
            }
            sum += i;
        }
        System.out.println("sum :: " + sum);
    }
}
