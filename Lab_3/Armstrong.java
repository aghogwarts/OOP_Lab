package Lab_3;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        int temp, num, r, sum = 0;
        System.out.println("\n>> Enter number to check if it's an Armstrong:");
        num = cmd.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + (r * r * r);
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("\n-- It is an armstrong");
        } else {
            System.out.println("\n-- It is not an armstrong");
        }
        System.out.println("\n\n");
        cmd.close();
    }
}
