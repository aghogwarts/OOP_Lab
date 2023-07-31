// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Factorial {
    public static void main(String[] args) {
        System.out.println("\n>> Program to print the factorial of a number:\n");
        int fact = 1;
        int n = 5;
        for(int x = n; x > 1; x--){
            fact*=x;
        }
        System.out.println("-- The factorial of "+n+" is "+fact);
    }
}
