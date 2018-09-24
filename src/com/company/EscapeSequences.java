package com.company;

public class EscapeSequences {

    public static void main(String[] args) {
	// A character preceded by a backslash () is an escape sequence and has special meaning to the compiler.
        // The following table shows the Java escape sequences. Note: Each escape sequence represents one character entity.
        //Write a Java program to print a box, an oval, or a diamond (choose one) using asterisks.

        System.out.println("********" + "\r") ;
        System.out.println("*      "  + "*" +"\r"); // carriage return
        System.out.println("*      "  + "*" +"\r");
        System.out.println("*      "  + "*" +"\r");
        System.out.println("*      "  + "*" +"\r");
        System.out.println("********" + "\r") ;
    }
}
