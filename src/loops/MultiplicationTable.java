package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Question: Given an integer,N, print its first 10 multiples. 
// Each multiple N x i(where 1<=i<=10) should be printed on a new line in the form: N x i = result. 

public class MultiplicationTable {
    public static void main(String args[]) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int N = Integer.parseInt(br.readLine());

        for(int num=1;num<=10;num++) {
            int result = N * num;
            System.out.println(N + " x " + num + " = " + result);
        }
    }
}
