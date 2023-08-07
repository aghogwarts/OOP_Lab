/* Write a Java program to multiply and divide a number by 2 using bitwise operator. [Hint: use left shift and right shift bitwise operators] */

package Lab_2;

import java.util.Scanner;

public class Bitwise_2 {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int num, mul, div;
        System.out.println(">> Enter a number to perform bitwise operations on: ");
        num = cmd.nextInt();
        cmd.close();
        mul = num << 1;
        div = num >> 1;
        System.out.println("\n-- The number multiplied by 2 is: " + mul + ", and divided by 2 is: " + div);
    }
}
