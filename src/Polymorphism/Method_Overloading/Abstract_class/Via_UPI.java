package Polymorphism.Method_Overloading.Abstract_class;

public class Via_UPI extends Payment{
    @Override
    void pay(int amount) {
        System.out.println("I Am UPI Pay Abstract");
    }
}
