package Lab_3;

import java.util.Scanner;

public class Prime_btwn_limits {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int m, n, i, j, prime;
        System.out.println("\nEnter m,n to generate prime numbers between them:\n>> ");
        m = cmd.nextInt();
        n = cmd.nextInt();
        cmd.close();
        i = m;
        System.out.println("\n> Prime numbers between " + m + " and " + n + " are:\n-- ");
        while (i <= n) {
            prime = 1;
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
                j++;
            }
            if (prime == 1) {
                System.out.println(i + "\t");
            }
            i++;
        }
        System.out.println("\n\n");
    }
}
