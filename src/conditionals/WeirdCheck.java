package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
