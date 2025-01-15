package Practise_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class date_time {
    public static void main(String[] args) {
        LocalDate l = LocalDate.now();
        System.out.println(l);

        LocalTime ld = LocalTime.now();
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
