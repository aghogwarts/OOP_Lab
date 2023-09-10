package Lab_3;

import java.util.Scanner;

public class Triangle_nested_for {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int i, N, j;
        System.out.println("\n>> Enter N to generate the pattern upto the number:");
        N = cmd.nextInt();
        System.out.println("\n-- Triangle Pattern:\n\n");
        for (i = 1; i <= N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }
}
