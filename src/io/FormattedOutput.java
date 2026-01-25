package io;

import java.util.Scanner;

//Question: 
// Input Format

// Every line of input will contain a String followed by an integer.
// Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

// Output Format

// In each line of output there should be two columns:
// The first column contains the String and is left justified using exactly 15 characters.
// The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, 
// you must pad your output's leading digits with zeroes.

public class FormattedOutput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=3; i++) {
            String str = sc.next();
            int x = sc.nextInt();

            if(str.length() <=10 && str.matches("[a-zA-Z]+") && x>=0 && x<=999) {
                System.out.printf("%-15s%03d%n", str,x);
            } else {
                System.out.println("Invalid input");
            }

        }
        sc.close();
    }
}
