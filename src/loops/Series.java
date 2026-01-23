package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int q = Integer.parseInt(br.readLine());

        for(int i=0;i<q;i++){
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int n = Integer.parseInt(inputs[2]);

            int sum = a;

            for(int j=0;j<n;j++) {
                sum = sum + (int)(Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        br.close();
    }
}
