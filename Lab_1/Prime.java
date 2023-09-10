
public class Prime {
    public static void main(String[] args) {
        System.out.println("\n>> Program to check whether the number specified is Prime:\n");
        int is_Prime = 1;
        int n = 15;
        for (int x = 2; x < n; x++) {
            if (n % x == 0) {
                is_Prime = 0;
                break;
            }
        }
        if (is_Prime == 0) {
            System.out.println("-- The number " + n + " is not Prime");
        } else {
            System.out.println("-- The number " + n + " is Prime");
        }
    }
}
