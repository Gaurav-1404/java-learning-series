class A{
    public void print(){

        System.out.println("This is a parent class");
    }
}

class B extends A{
    @Override
    public void print(){

        System.out.println("This is a child class");
    }
}
class C extends B{
    @Override
    public void print(){
        
        System.out.println("This is class Grand child class");
    }
}
public class C7_Method_overriding {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new B();
        A obj3 = new C();

        obj1.print(); // Parent version
        obj2.print(); // Child version
        obj3.print(); // Grandchild version
    }
}
