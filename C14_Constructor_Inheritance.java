// constructor 
// constructor overloading

class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int a) {
        System.out.println("This is a constructor contains: " + a);
    }
    int x;  
    public int getx() {
        return x;
    }
    public void setx(int x) {
        this.x = x;
    }
    public void PrintMeB() {
        System.out.println("I am in Base class");
    }
}

class derived1 extends Base1 {
    derived1() {
        super(0);
        System.out.println("This is a derived class constructor");
    }
    derived1(int a, int b) {
        super(20);
        System.out.println("This is a constructor contains: " + a + " " + b);
    }
    int y;

    public int gety() {
        return y;
    }
    public void sety(int y) {
        this.y = y;
    }
    public void PrintMeD() {
        System.out.println("I am in derived class");
    }
}

class Ddrived extends derived1 {
    Ddrived() {
        System.out.println("This is a D derived class");
    }
    Ddrived(int a) {
        super(10, 15);
        System.out.println("This is a D derived class with: " + a);
    }
}

public class C14_Constructor_Inheritance {

    public static void main(String[] args) {

        Base1 b = new Base1();
        b.PrintMeB();   // use b
        System.out.println();

        derived1 a = new derived1();
        a.PrintMeD();   // use a
        System.out.println();

        derived1 d = new derived1(4, 9);
        d.PrintMeB();   // use d
        System.out.println();

        Ddrived c = new Ddrived(5);
        c.PrintMeD();   // use c
        System.out.println();
    }
}
