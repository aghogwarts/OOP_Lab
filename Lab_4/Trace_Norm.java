import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Trace_Norm {
    public static void main(String[] args) {
        int i, j, N, trace = 0;
        double norm, sum = 0;
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        Scanner cmd = new Scanner(System.in);

        System.out.println("\n>> Enter dimension N of the square matrix:");
        N = cmd.nextInt();
        int a[][] = new int[N][N];

        System.out.println("\n> Enter the elements:");
        for (i = 0; i < N; i++) {
            System.out.println("\n+ Enter elements of Row " + (i + 1) + " -");
            for (j = 0; j < N; j++) {
                a[i][j] = cmd.nextInt();
            }
        }

        cmd.close();

        for (i = 0; i < N; i++) {
            trace += a[i][i];
            for (j = 0; j < N; j++) {
                sum = sum + a[i][j] * a[i][j];
            }
        }
        norm = Math.sqrt(sum);

        System.out.println("\n-- Trace of the matrix is: " + trace + "\n");
        System.out.println("-- Norm of the matrix is: " + (numberFormat.format(norm)) + "\n");
    }
}