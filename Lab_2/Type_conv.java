/* Write a Java program to read an int number, double number and a char from keyboard and perform the following conversions:- int to byte, char to int, double to byte, double to int */

package Lab_2;

import java.util.Scanner;

public class Type_conv {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int int_num;
        double doub_num;
        char char_1;
        System.out.println("\n>> Enter a integer: ");
        int_num = cmd.nextInt();
        System.out.println("\n>> Enter a double: ");
        doub_num = cmd.nextDouble();
        System.out.println("\n>> Enter a character: ");
        char_1 = cmd.next().charAt(0);
        cmd.close();
        System.out.println("\n-- Integer converted to byte is: " + (byte) int_num);
        System.out.println("-- Character converted to int is: " + (int) char_1);
        System.out.println("-- Double converted to byte is: " + (byte) doub_num);
        System.out.println("-- Double converted to int is: " + (int) doub_num);
    }
}
