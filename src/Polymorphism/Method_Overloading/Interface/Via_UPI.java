package Polymorphism.Method_Overloading.Interface;

public class Via_UPI implements Payment
{
    @Override
    public void pay(int amount) {
        System.out.println("I Am UPI Pay Interface");
    }
}

