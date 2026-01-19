package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StdinAndStdout {
    public static void  main(String args[]) throws IOException{
        
        //Reading input from stdin and writing output to stdout using BufferedReader and inputStreamReader
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println("You entered integer: " + num);
        System.out.println("You entered string: " + str);
        br.close();

        //Reading input from stdin and writing output to stdout using Scanner
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

