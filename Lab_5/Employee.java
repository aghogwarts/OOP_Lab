package Lab_5;

import java.util.Scanner;

public class Employee {
    Scanner cmd = new Scanner(System.in);
    String name, city;
    float da, hra, basic_salary, total_salary;

    public void getdata() {
        System.out.println("\n>> Enter data of the employee:");
        System.out.println("\n- Name:");
        name = cmd.nextLine();
        System.out.println("\n- City:");
        city = cmd.nextLine();
        System.out.println("\n- Basic Salary:");
        basic_salary = cmd.nextFloat();
        System.out.println("\n- Dearness Allowance %:");
        da = cmd.nextFloat();
        System.out.println("\n- House Rent Allowance %:");
        hra = cmd.nextFloat();
    }

    public void calculate() {
        total_salary = basic_salary + (basic_salary * (da / 100)) + (basic_salary * (hra / 100));
    }

    public void display() {
        System.out.println("\n-- The Total Salary of the employee is: " + total_salary);
    }

    public static void main(String[] args) {
        int response;
        Employee emp = new Employee();

        do {
            System.out.println(
                    "\n--------------------------------------------------\n>> Choose options:\n0. Exit\n1. Get Employee data (might override previous data!)\n2. Display Total Salary");
            response = emp.cmd.nextInt();
            emp.cmd.nextLine();
            System.out.println("--------------------------------------------------");
            switch (response) {
                case 1:
                    emp.getdata();
                    break;
                case 2:
                    emp.calculate();
                    emp.display();
                    break;
                default:
                    System.out.println("\n-- Enter valid input !!");
            }
        } while (response != 0);
        emp.cmd.close();
    }
}
