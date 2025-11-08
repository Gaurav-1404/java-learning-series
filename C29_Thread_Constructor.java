class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<50) {
            System.out.println("i am a thread");
            i++;
        }
    }
}


public class A29_Thread_Constructor {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Alpha");
        Mythr t2 = new Mythr("Bravo");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is: " + t1.getId());
        System.out.println("The thread name is: " + t1.getName());
        
        System.out.println("The id of the thread is: " + t2.getId());
        System.out.println("The thread name is: " + t2.getName());
    }
}