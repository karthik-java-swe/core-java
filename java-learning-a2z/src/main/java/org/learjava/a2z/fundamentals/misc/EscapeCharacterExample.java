package org.learjava.a2z.fundamentals.misc;

public class EscapeCharacterExample {
    public static void main(String args[]) {
        //inserts a Tab Space
        String str = "James\tGosling";
        System.out.println(str);
        //inserts a New Line
        String str1 = "Push yourself!\nNobody is going to do that for you!";
        System.out.println(str1);
        //it inserts a backslash
        String str2 = "And\\Or";
        System.out.println(str2);
        //it inserts a Carriage. Brings cursor to start of line.
        String str3 = "Hello healthy \rWorld";
        System.out.println(str3);
        //it prints a single quote
        String str4 = "Oracle\'s Java";
        System.out.println(str4);
        //it prints double quote
        String str5 = "New\'Twilight'Line";
        System.out.println(str5);
    }
}  