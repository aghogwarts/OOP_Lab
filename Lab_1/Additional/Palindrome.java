/* Write a program to check whether a number is palindrome or not. */

public class Palindrome {
    public static void main(String[] args) {
        int n = 3543, rev, num, rd;
        rev = 0;
        num = n;
        while (n != 0) {
            rd = n % 10;
            rev = rev * 10 + rd;
            n = n / 10;
        }
        if (rev == num) {
            System.out.println("\n-- The entered number " + num + " is a palindrome");
        } else {
            System.out.println("\n-- The entered number " + num + " is not a palindrome");
        }
    }
}
