package Practise_Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy---E H:M a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String md = ldt.format(dtf2);
        System.out.println(md);
        String mydate = ldt.format(dtf);
        System.out.println(mydate);
    }
}
