/* Write a Java program to find area and circumference of a rectangle. */

import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int area, circ, l = 0, b = 0;
        System.out.println(">> Enter length: ");
        l = cmd.nextInt();
        System.out.println(">> Enter breadth: ");
        b = cmd.nextInt();
        cmd.close();
        area = l * b;
        circ = 2 * (l + b);
        System.out.println("\n-- The Area of the rectange is: " + area + ", and the Circumference is: " + circ);
    }
}
