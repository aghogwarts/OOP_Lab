// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Multiplication_Table {
    public static void main(String[] args) {
        int n = 5, i,  k = 10;
        System.out.println("\n>> Multiplication Table of n till k terms is:\n");
        for (i = 1; i<= k; i++) {
            System.out.println("-- "+n+" X "+i+" = "+n*i);
        }
    }
}
