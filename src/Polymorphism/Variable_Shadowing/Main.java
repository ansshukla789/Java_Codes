package Polymorphism.Variable_Shadowing;

public class Main {
    public static void main(String[] args) {

        Child c = new Child();
        c.show();
        //20
        // 10
        System.out.println(c.x); // 20
// Variable shadowing depends on reference type, not object type.

        Parent p = new Child(); // Upcasting

        System.out.println(p.x); //10
        /* In this line:

        Parent → Reference Type
        new Child() → Object Type*/

    }
}