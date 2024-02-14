package org.learjava.a2z.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingFileNotFoundThrows {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.dat");
        System.out.println(file.exists());
        Scanner scan = new Scanner(file);
    }
}