// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int num;
        int pos = 0 ,neg = 0 ,zero = 0;
        for (int x = 1; x <= 10; x++) {
            System.out.println(">> Enter number: "); 
            num = cmd.nextInt();
            if (num > 0) {
                pos++;
            }
            else if (num < 0) {
                neg++;
            }
            else {
                zero++;
            }
        }
        System.out.println("\n\n-- The number of Positive values is: "+pos); 
        System.out.println("\n-- The number of Negative values is: "+neg);
        System.out.println("\n-- The number of Zero values is: "+zero);
    }
}
