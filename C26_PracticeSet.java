package Calculator;

class Calculator{
    public void calculate(int a, int b){
        System.out.println("The result is: " + a+b);
    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("The result is: " + Math.sin(a+b));
    } 
}
class HybridCalculator{
    public void calculate(int a,int b){
        System.out.println("The result is: " + a+b);
        System.out.println("The result is: " + Math.sin(a+b));
    }
}
public class C26_PracticeSet {
    public static void main(String[] args) {
        // javac -d. C26_PracticeSet.java   
        // this line run in  terminal
    }
}
