package io;

import java.io.IOException;
import java.util.Scanner;

//Question: In this challenge, you must read 3 integers and strings from stdin and then print them to stdout. 
// Each integer must be printed on a new line.

public class StdinAndStdout {
    public static void  main(String args[]) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        System.out.println("Integer a: " + a);
        System.out.println("Integer b: " + b);
        System.out.println("Integer c: " + c);

        System.out.println("String str1: " + str1);
        System.out.println("String str2: " + str2);
        System.out.println("String str3: " + str3);

        sc.close();
    }
}

