package datatype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypesFit {
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int q = Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            try {
                long x = Long.parseLong(br.readLine());
                System.out.println(x + " can be fitted in:");
                if(x>=(Math.pow(-2,7)) && x<=(Math.pow(2,7))-1) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>=(Math.pow(-2,15)) && x<=(Math.pow(2,15))-1) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>=(Math.pow(-2,31)) && x<=(Math.pow(2,31))-1) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>=(Math.pow(-2,63)) && x<=(Math.pow(2,63))-1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                String invalidInput = br.readLine();
                System.out.println(invalidInput + " cannot be fitted anywhere");
            }
        }
        br.close();
    }
}
