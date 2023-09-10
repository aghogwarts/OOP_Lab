package Lab_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sine_series {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        double n, x, numb, PI = 3.141592, term, sum, i;
        System.out.println("\n>> Enter n and k:");
        n = cmd.nextDouble();
        x = cmd.nextDouble();
        cmd.close();
        numb = x;
        x = x * PI;
        term = x;
        sum = x;
        for (i = 1; i <= n; i++) {
            term = (((-1) * x * x) / (2 * i * 1));
            sum = term;
        }
        System.out.println(
                "\n-- Library value of sin(" + numberFormat.format(numb) + ") = " + Math.sin(x));
        System.out.println("\n-- sin(" + numberFormat.format(numb) + ") = " + numberFormat.format(sum));
        System.out.println("\n\n");
    }
}
