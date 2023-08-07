/* Write a Java program to find whether a given year is leap or not using boolean data type. [Hint: leap year has 366 days;] */

package Lab_2;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int year;
        boolean is_Leap;
        System.out.println(">> Enter Year: ");
        year = cmd.nextInt();
        cmd.close();
        if (year % 4 != 0) {
            is_Leap = false;
        } else if (year % 100 != 0) {
            is_Leap = true;
        } else if (year % 400 != 0) {
            is_Leap = false;
        } else {
            is_Leap = true;
        }
        if (is_Leap) {
            System.out.println("\n-- The entered year is a Leap Year.");
        } else {
            System.out.println("\n-- The entered year is a Common Year");
        }
    }
}
