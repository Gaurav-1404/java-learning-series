// Topic: Dynamic Method Dispatch (Runtime Polymorphism)
// Description: Demonstrates how Java decides which overridden method to call at runtime.

class Phone {
    public void print() {
        System.out.println("This is a phone");
    }

    public void on() {
        System.out.println("Turning on phone...");
    }
}

class Smartphone extends Phone {
    @Override
    public void on() {
        System.out.println("Turning on smartphone...");
    }

    public void greet() {
        System.out.println("This is a smartphone");
    }
}

public class C15_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        // Object of parent class
        Phone nokia1100 = new Phone();
        nokia1100.print();
        nokia1100.on();

        System.out.println();

        // Object of child class
        Smartphone samsung = new Smartphone();
        samsung.print();  // inherited method
        samsung.greet();  // unique to Smartphone
        samsung.on();     // overridden method

        System.out.println();

        // Dynamic Method Dispatch
        Phone nokia1102 = new Smartphone();  // reference of parent, object of child
        nokia1102.on();  // executes Smartphone's version of 'on()'

        // nokia1102.greet(); // ❌ Not allowed: reference type is Phone
    }
}
