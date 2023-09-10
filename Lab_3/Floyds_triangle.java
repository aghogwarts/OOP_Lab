package Lab_3;

import java.util.Scanner;

public class Floyds_triangle {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int i, N, num = 1, j;
        System.out.println("\n>> Enter N to generate Floyd's Triangle upto the limit:");
        N = cmd.nextInt();
        System.out.println("\n-- Floyd's Triangle:\n\n");
        for (i = 1; i <= N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("\n");
        }
    }
}
