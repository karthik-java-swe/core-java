package org.learjava.a2z.control_flow;

public class ExampleBreak {
    public static void main(String[] args) {
        String signalColor = "YELLOW";
        switch (signalColor) {
            case "RED":
                System.out.println("Signal is RED.STOP!");
                break;
            case "YELLOW":
                System.out.println("Signal is YELLOW.BE READY!");
                break;
            case "GREEN":
                System.out.println("Signal is GREEN.GO!");
                break;
            default:
                System.out.println("ERROR. Invalid Colour!");
                break;
        }
    }
}
