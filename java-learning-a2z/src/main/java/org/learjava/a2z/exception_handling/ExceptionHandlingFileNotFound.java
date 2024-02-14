package org.learjava.a2z.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingFileNotFound {
    public static void main(String[] args) {
        File file = new File("scores.dat");
        System.out.println(file.exists());
        try {
            Scanner scan = new Scanner(file);//Critical section of code.
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
