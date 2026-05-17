package Polymorphism.Method_Overriding;

public class Main
{
    public static void main ( String[] args)
    {
Payment p=new Via_UPI();
p.pay(500);
Payment p1=new Via_CreditCard();
p1.pay(500);



    }}

