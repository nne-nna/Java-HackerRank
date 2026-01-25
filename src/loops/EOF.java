package loops;

import java.util.Scanner;

//Question: The challenge here is to read n lines of input until you reach EOF, 
// then number and print all n lines of content.

public class EOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 1;

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(index + " " + line);
            index++;
        }
        sc.close();
    }
}
