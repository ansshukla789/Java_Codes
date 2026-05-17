package Polymorphism.Method_Overloading.Regular_class;

public class Main
{
    public static void main ( String[] args) {

    Payment p=new Payment();
    // Here Calling Of Method depends Upon Object Type not reference Type
    p.pay(500);
    p.pay(500.98);
    p.pay("Hello123");
    }
}
/* Output
Pay int Amount 500
Pay double Amount 500.98
Pay Via PromoCode Hello123

 */