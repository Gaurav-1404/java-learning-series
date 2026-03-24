import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C47_JavaTime_API {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // create own date time format
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df);
        System.out.println(myDate);

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);

        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd.MM.yyyy -- E H:m a");
        String mydate3 = dt.format(df3);
        System.out.println(mydate3);
    }
}
