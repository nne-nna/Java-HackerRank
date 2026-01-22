package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main(String args[]) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int N = Integer.parseInt(br.readLine());

        //for loop to print multiplication table
        for(int num=1;num<=10;num++) {
            int result = N * num;
            System.out.println(N + " x " + num + " = " + result);
        }
    }
}
