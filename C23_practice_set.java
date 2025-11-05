/* Practise Set

1. Create an abstract class Pen with methods write() and refill() as abstract methods
2. Use the Pen class from Q1 to create a concrete class FountainPen with additional method changeNib()
3. Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep methods.
4. Create a class TelePhone with ring(), lift() and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism
5. Demonstrate polymorphism using monkey class from Qus 3.
6. Create an interface TVRemote and use it to inherit another interface SmartTVRemote.
7. Create a class Tv which implements TVRemote interface from Q 6. */

//Q1-----
abstract class Pen{
    abstract void write();
    abstract void refil();
}
//Q2-----
class FountainPen extends Pen {
    public void changeNib(){
        System.out.println("Changing nib");
    }
    public void write(){
        System.out.println("Start writing");
    }
    public void refil(){
        System.out.println("Refiling pen");
    }
}
//Q3-----
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Monkey jumping...");
    }
    public void bite(){
        System.out.println("Monkey bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Human eating...");
    }
    public void sleep(){
        System.out.println("Human sleeping...");
    }
    @Override
    public void jump(){
        System.out.println("Human jumps...");
    }
    @Override
    public void bite(){
        System.out.println("Human bites...");
    }
}
// Q4---
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect(); 
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Smart telephonr ringing...");
    }
    public void lift(){
        System.out.println("lifting smart telephone...");
    }
    public void disconnect(){
        System.out.println("Smart telephone disconnect...");
    }
}
//Q5-----
class ForestAnimal extends Monkey{
    public void jump(){
        System.out.println("Forest Animal Jumping...");
    }
    public void eat(){
        System.out.println("Forest animal eating...");
    }
}
//Q6-----
interface TVRemote {
    void volumeUp();
    void changeChannel();
}
interface SmartTVRemote extends TVRemote{
    void youTube();
    void musicPlayer();
}
//Q7-----
class TV implements TVRemote{
    public void volumeUp(){
        System.out.println("Volume up...");
    }
    public void changeChannel(){
        System.out.println("Changing channel...");
    }
}
class SmartTV extends TV implements SmartTVRemote{
    public void youTube(){
        System.out.println("Opening YouTube...");
    }
    public void musicPlayer(){
        System.out.println("Playing music...");
    }
}

public class C23_practice_set {
    public static void main(String[] args) {
        FountainPen fp1 = new FountainPen();
        fp1.changeNib();

        Human h1 = new Human();
        h1.eat();
        h1.bite();

        SmartTelephone st1 = new SmartTelephone();
        st1.disconnect();

        Monkey m1 = new Monkey();
        ForestAnimal fa1 = new ForestAnimal();
        m1.jump();
        fa1.jump();

        TV tvr1 = new TV();
        tvr1.changeChannel();
        
        SmartTV stvr1 = new SmartTV();
        stvr1.youTube();
        stvr1.volumeUp();
        
    }
}
