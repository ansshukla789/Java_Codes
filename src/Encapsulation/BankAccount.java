package Encapsulation;

public class BankAccount
{
  // Making Fields Private
  // Private Member Can Be Used Only Within The Class

  private  String name;
  private double balance;
  private String accountNumber;
// Creating Parameterized Constructor
  public BankAccount(String name, int balance, String accountNumber) {
   // Passing Constructor variable To class Variable
    this.name=name;
    this.balance=balance;
    this.accountNumber=accountNumber;
  }
  // Controlled Access
  // Getter Method
  public String getname()
  {
    return name;
  }
  public String getAccountNumber()
  {
    return accountNumber;
  }
// Setter Method

  public double finalCreditBalance(double amount)
  {
    balance=balance+amount;
    return balance;
  }
public double finalDebitBalance(double amount)
{
  balance=balance-amount;
  return balance;
}
}
