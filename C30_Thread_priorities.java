class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        
        while (true) {
            System.out.println("This is a thread and the thread name and id is: " + this.getName() +", "+ this.getId());
        }
    }
}

public class C30_Thread_priorities {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Alpha h bro ");
        Mythr t2 = new Mythr("beta");
        Mythr t3 = new Mythr("Gamma");
        Mythr t4 = new Mythr("Delta");
        Mythr t5 = new Mythr("Epsilon h bro");
        t1.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(5);
        t3.setPriority(1);
        t2.setPriority(2);
        t4.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
