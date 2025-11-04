interface Bicycle{
    void applyBrake(int dec);
    void speedUp(int inc);
}
interface Horn{
    void blowHorn1();
    void blowHorn2();
}

class Avon implements Bicycle,Horn{
    int speed = 7;
    public void applyBrake(int dec){
        speed = speed - dec;
    }
    public void speedUp(int inc){
        speed = speed + inc;
    }
    int currSpeed(){
        return speed;
    }
    public void blowHorn1(){
        System.out.println("pe pepe pe");
    }
    public void blowHorn2(){
        System.out.println("side Please!");
    }
    void blowHorn3(){
        System.out.println("Main hoon na po po po!");
    }
}
public class C19_interfaces {
    public static void main(String[] args) {
        
        Avon Avon327 = new Avon();
        Avon327.speedUp(7);

        System.out.println("the current speed is: " + Avon327.currSpeed());

        Avon327.applyBrake(3);
        System.out.println("the current speed is: " + Avon327.currSpeed());

        Avon327.blowHorn2();

        Avon327.blowHorn3();
    }
}
