
public class Prime_1_100 {
    public static void main(String[] args) {
        System.out.println("\n>> Program to print the prime numbers from 1-100:\n\n");
        for (int i = 2; i <= 100; i++) {
            int is_Prime = 1;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    is_Prime = 0;
                    break;
                }
            }
            if (is_Prime == 1) {
                System.out.println(i);
            }
        }
    }
}
