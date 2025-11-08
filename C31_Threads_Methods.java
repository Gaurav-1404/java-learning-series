class Mythr1 extends Thread{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("This is a thread 1");
            try {
                this.sleep(500);// stops the thread for (__) seconds
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
class Mythr2 extends Thread{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("This is a thread 2");
            i++;
        }
    }
}

public class C31_Threads_Methods {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1();
        Mythr2 t2 = new Mythr2();
        t1.start();
        try{
            t1.join(); // stop other thread until this not terminated.
        }
        catch (Exception e) {
            System.out.println(e);
        }
        t2.start();

    }   
}
