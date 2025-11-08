class Thread1 extends Thread{
    public Thread1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("Good Morning");
            i++;
        }
        System.out.println(this.getPriority());
    }
}
class Thread2 extends Thread{
    public Thread2(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("Welcome");
            this.getPriority();
            try {
                this.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
        System.out.println(this.getState());
    }
}
public class A32_PracticeSet {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Good Morning");
        Thread2 t2 = new Thread2("Welcome");
        System.out.println(t1.getState());
        t1.start();
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }    
}
