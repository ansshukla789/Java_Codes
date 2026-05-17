package Polymorphism.Method_Shadowing;

public class Main
{
    public static void main ( String[] args)
    {
     Parent p=new Child();
        p.display(); // I Am Parent Method
        //Because static methods are resolved using reference type
        Parent.display();
        Child.display();
    }}

