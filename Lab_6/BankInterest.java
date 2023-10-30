/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author student
 */
public class BankInterest {
    public static void main(String args[])
    {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
    }
}

class Bank1
{
    double rate;
    void getRateOfInterest()
    {
        System.out.println(rate);
    }
}

class SBI extends Bank1
{
    SBI()
    {
        super.rate = 0.08;
        super.getRateOfInterest();
    }
}

class ICICI extends Bank1
{
    ICICI()
    {
        super.rate = 0.07;
        super.getRateOfInterest();
    }
}

class AXIS extends Bank1
{
    AXIS()
    {
        super.rate = 0.09;
        super.getRateOfInterest();
    }
}