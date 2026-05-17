package Polymorphism.Method_Overriding;

public class Via_UPI extends Payment
{
@Override
    public void pay(int amount)
    {
        System.out.println("Payment Via UPI");
    }
}
