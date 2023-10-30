    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author student
 */
public class Bank {
    public static void main(String args[])
    {
        currentAccount c1 = new currentAccount("Arjun", 220953174, 10000);
        savingsAccount s1 = new savingsAccount("Arjun", 220953174, 5000);
        c1.deposit(200);
        c1.display();
        s1.interest(0.15, 2);
        s1.display();
        s1.withdraw(200);
        s1.display();
    }
}

class Account
{
    String name;
    int accNo;
    String accType;
    Account(String n, int no, String type)
    {
        name = n;
        accNo = no;
        accType = type;
    }
}

class currentAccount extends Account
{
    currentAccount(String n, int no, int bal)
    {
        super(n, no, "current");
        balance = bal;
        if(balance < 5000)
            balance -= 0.02 * balance;
    }
    double balance;
    void deposit(int amt)
    {
        balance += amt;
    }
    void display()
    {
        System.out.println("Total balance is " + balance);
    }
}

class savingsAccount extends Account
{
    savingsAccount(String n, int no, int bal)
    {
        super(n, no, "savings");
        balance = bal;
    }
    double balance;
    void deposit(double amt)
    {
        balance += amt;
    }
    void display()
    {
        System.out.println("Total balance is " + balance);
    }
    void interest(double rate, int time)
    {
        balance += balance * rate * time;
    }
    void withdraw(double amt)
    {
        balance -= amt;
    }
}