class Base{
    int x;  
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x =x;
    }
    public void PrintMeB(){
        System.out.println("I am in Base class");
    }
}
class derived extends Base{
    int y;

    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y =y;
    }
    public void PrintMeD(){
        System.out.println("I am in derived class");
    }

}

public class C13_Inheritance {

    public static void main(String[] args) {
        Base b = new Base();
        b.setx(10);
        System.out.println(b.getx());

        
        b.PrintMeB();
        derived d = new derived();
        d.setx(15);
        System.out.println(d.getx());
        d.sety(15);
        System.out.println(d.gety());
        d.PrintMeB();
        d.PrintMeD();
    }
}