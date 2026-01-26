package staticinitialization;

import java.util.Scanner;

//Question: You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H . 
// You should read the variables from the standard input.
// If  or B<=0 or H<=0,the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
// Input Format
// There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.
// Output Format
// If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

public class StaticBlocks {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        try {
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();

            if(B<=0 || H<=0) {
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            sc.close();
        } catch(Exception e) {
            flag = false;
        }
    }
    public static void main(String[] args){
        if(flag) {
            int area = B*H;
            System.out.println(area);
        }
    } 
}


