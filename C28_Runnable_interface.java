class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("I am a thread1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("I am a thread2");
            i++;
        }
    }
}

public class C28_Runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 mt1 = new MyThreadRunnable1();
        Thread T1 = new Thread(mt1);

        MyThreadRunnable2 mt2 = new MyThreadRunnable2();
        Thread T2 = new Thread(mt2);

        T1.start();
        T2.start();
    }
}
