/* Write a Java program to generate odd numbers from 1 to 100. */

public class Odd_1_100 {
    public static void main(String[] args) {
        System.out.println("\n>> Program to print the odd numbers from 1-100:\n\n");
        for (int i = 2; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("-- " + i);
            }
        }
    }
}
