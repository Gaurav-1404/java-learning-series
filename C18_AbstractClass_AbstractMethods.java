abstract class parent2{
    public parent2(){
        System.out.println("parent2 constructor!");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();
    abstract public void greet2();

}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good Morning!");
    }
    public void greet2(){
        System.out.println("Namaskar!");
    }
}
abstract class child3 extends parent2{
    public void good(){
        System.out.println("I am good");
    }
} 
 // can't create object of any abstract class
public class C18_AbstractClass_AbstractMethods {
    public static void main(String[] args) {
        // parent2 p2 = new parent2();---- error

        child2 c2 = new child2();
        
        // child3 c3 = new child3(); ---- error
        
    }
}
