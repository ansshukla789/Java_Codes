package Polymorphism.Method_Overloading.Regular_class;

public class Payment
{
    // Same Name Different Parameter ----> Method Overloading
    public void pay (int amount) // pay method with int type parameter
    {
        System.out.println("Pay int Amount" + " " + amount);
    }

    public void pay (double amount)//pay method with double type parameter

    {
        System.out.println("Pay double Amount" +" " + amount);
    }
    public void pay (String PromoCode)//pay method with String type parameter
    {
        System.out.println("Pay Via PromoCode" +" " + PromoCode);
    }
}
