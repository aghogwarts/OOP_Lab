/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author student
 */
public class Fees {
    public static void main(String args[])
    {
        UG u1 = new UG(220953174, "Arjun", 19, 3, 509000);
        PG p1 = new PG(190522574, "Aditya", 24, 9, 203000);
        UG u2 = new UG(220953274, "Aniket", 19, 3, 509000);
        u1.display();
        u2.display();
        p1.display();
        System.out.println(UG.UGcount);
        System.out.println(PG.PGcount);
    }
}

class Student
{
    int regNo;
    String name;
    int age;
    static int UGcount = 0, PGcount = 0;
    Student(int no, String n, int a)
    {
        regNo = no;
        name = n;
        age = a;
    }
}

class UG extends Student
{
    int semester;
    double fees;
    UG(int reg, String n, int a, int sem, double f)
    {
        super(reg, n, a);
        semester = sem;
        fees = f;
        super.UGcount++;
    }
    void display()
    {
        System.out.println(regNo + "\t" + name + "\t" + age + "\t" + semester + "\t" + fees + "\tUG");
    }
}

class PG extends Student
{
    int semester;
    double fees;
    PG(int reg, String n, int a, int sem, double f)
    {
        super(reg, n, a);
        semester = sem;
        fees = f;
        super.PGcount++;
    }
    void display()
    {
        System.out.println(regNo + "\t" + name + "\t" + age + "\t" + semester + "\t" + fees + "\tPG");
    }
}