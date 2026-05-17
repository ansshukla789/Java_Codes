package Polymorphism.Method_Overloading.Interface;

public class Main

{
    public static void main ( String[] args) {
    Payment p=new Via_UPI();
    // Here Calling Of Method depends Upon Object Type not reference Type
    p.pay(500);

    }
}
