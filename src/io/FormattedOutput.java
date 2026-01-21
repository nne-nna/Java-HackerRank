package io;

import java.util.Scanner;

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
