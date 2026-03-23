// this is an Abstract class

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class C46_CalendarAndGregorianCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Calendar Type: "+ c.getCalendarType());
        System.out.println("Years: " + c.get(Calendar.YEAR));
        System.out.println("Day of Years: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH)+1));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println();

        // Gregorian Calendar
        GregorianCalendar gc =new GregorianCalendar();
        System.out.println( gc.isLeapYear(2020));
        System.out.println(gc.FEBRUARY);
        System.out.println(gc.getTimeZone());
        System.out.println(TimeZone.getAvailableIDs()[60]);
        System.out.println(TimeZone.getTimeZone("Asia/Kolkata"));
            
    }
}
