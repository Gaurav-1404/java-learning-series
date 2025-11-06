import MyPackages.tools.*;
public class A23_Java_Packages {
    public static void main(String[] args) {
        calc obj1 = new calc();
        AdvCalc obj2 = new AdvCalc();
        int a = 5;
        int b = 4;
        System.out.println(obj1.add(a, b));
        System.out.println(obj2.multi(a, b));
    }
}
