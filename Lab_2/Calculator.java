/* Create the equivalent of a four-function calculator. The program should request the user to enter a number,
 an operator, and another number. (Use floating point.) It should then carry out the specified arithmetic 
 operation: adding, subtracting, multiplying, or dividing the two numbers. Use a switch statement to select the operation. 
 Finally, display the result. When it finishes the calculation, the program should ask if the user wants to do another calculation.
 The response can be 'y' or 'n'. [Hint: use do-while loop] */

package Lab_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        float a = 0, b = 0, result = 0;
        char oper, response = 'Y';
        do {
            System.out.println("\n>> Enter Number 1: ");
            a = calc.nextFloat();
            System.out.println("\n>> Enter Operation (+ for add, - for sub, * for mul, / for div) 1: ");
            oper = calc.next().charAt(0);
            System.out.println("\n>> Enter Number 2: ");
            b = calc.nextFloat();
            switch (oper) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                default:
                    System.out.println("\n-- Enter valid operation !");
            }
            System.out.println("\n-- Result: " + a + " " + oper + " " + b + " = " + result);
            System.out.println("\n+ Do you want to perform another operation (Y/N) ? ");
            response = calc.next().charAt(0);
        } while (response == 'Y');
        calc.close();
    }
}
