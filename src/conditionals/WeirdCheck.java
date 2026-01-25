package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Question: Given an integer,n, perform the following conditional actions:
// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5, print Not Weird
// If n is even and in the inclusive range of 6 to 20, print Weird
// If n is even and greater than 20, print Not Weird

public class WeirdCheck {
    public static void main(String args[]) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num = Integer.parseInt(br.readLine());
        br.close();

        if(num%2 != 0) {
            System.out.println("Weird");
        } else if(num%2 == 0 && num>=2 && num<=5) {
            System.out.println("Not Weird");
        } else if(num%2 == 0 && num>=6 && num<=20) {
            System.out.print("Weird");
        } else if (num%2 == 0 && num>20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Whatever");
        }
    }
}
