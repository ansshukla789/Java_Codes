package Encapsulation;

public class Main
{
    public static void main ( String[] args)
    {
        BankAccount b=new BankAccount("Anshul",5000,"111111111111"); // creating object of Class
        System.out.println(  b.getname()); // calling getter method
        System.out.println( b.getAccountNumber()); // calling getter method
        System.out.println( b.finalCreditBalance(1000));// calling setter method
        System.out.println( b.finalDebitBalance(4000));
    }
}
