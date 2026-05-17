package Polymorphism.Variable_Shadowing;

public class Child extends Parent
{
    int x=20; // Shadow Parent Variable
    void show() {
        System.out.println(x);        // child x
        System.out.println(super.x);  // parent x
    }
}
