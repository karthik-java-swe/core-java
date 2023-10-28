package org.learjava.a2z.control_flow;

public class ExampleReturn {
    public static void main(String[] args) {
        System.out.println(performOperation("sum",20,30));
    }

    private static int performOperation(String operation, int num1, int num2) {
        if (operation.equals("sum")) {
            return num1 + num2;
        } else if (operation.equals("difference")) {
            return num1 - num2;
        } else {
            return num1 * num2;
        }
    }
}
