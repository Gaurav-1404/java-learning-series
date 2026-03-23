import java.util.Date;

public class C45_DateClass {
    public static void main(String[] args) {

        System.out.println("MAX Value of long variable: "+ Long.MAX_VALUE);
        System.out.println("The current time in milisecond: "+ System.currentTimeMillis());
        Long resttime = (Long.MAX_VALUE - System.currentTimeMillis())/1000/60/60/24/365;
        System.out.println("Rest time to reach max: " + resttime + " years ");

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear());
    }
}
