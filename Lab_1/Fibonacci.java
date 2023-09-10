
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("\n>> Program to print the Fibonacci series upto 15 terms:\n");
        int n_1 = 0;
        int n_2 = 1;
        int temp;
        System.out.println(0);
        System.out.println(1);
        for (int x = 1; x < 13; x++) {
            temp = n_2;
            n_2 += n_1;
            n_1 = temp;
            System.out.println(n_2);
        }
    }
}
