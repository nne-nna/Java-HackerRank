package io;

import java.util.Scanner;

//Question: In this challenge, you must read an integer, a double, and a String from stdin, 
// then print the values according to the instructions in the Output Format section below.

public class StdinAndStdoutII {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine(); 
        String s = sc.nextLine();
        sc.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
