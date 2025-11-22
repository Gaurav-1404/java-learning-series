public class C44_Date_Time {
    public static void main(String[] args) {

        long ms = System.currentTimeMillis();   // current milliseconds
        long seconds = ms / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;

        System.out.println("Milliseconds: " + ms);
        System.out.println("Seconds: " + seconds);
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println("Days: " + days);
        System.out.println("Years: " + years);
    }
}
