/* Write a Java program to find the result of the following expressions for various values of a & b:
    a. (a << 2) + (b >> 2)
    b. (b > 0)
    c. (a + b * 100) / 10
    d. a & b 
*/

package Lab_2.Additional;

import java.util.Scanner;

public class Expressions {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("\n>> Enter Number 1: ");
        a = calc.nextInt();
        System.out.println("\n>> Enter Number 2: ");
        b = calc.nextInt();
        System.out.println("\n-- Result: (" + a + " << 2) + (" + b + " >> 2) = " + (a << 2) + (b >> 2));
        System.out.println("\n-- Result: (" + b + " > 0) = " + (b > 0));
        System.out.println("\n-- Result: (" + a + " + " + b + " * 100) / 10 = " + (a + b * 100) / 10);
        System.out.println("\n-- Result: (" + a + " & " + b + ") = " + (a & b));
        calc.close();
    }
}
