package Practise_Date_Time;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gegorian_calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR) +":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
//        System.out.println(cal.isLeapyear());
        System.out.println(cal.isLeapYear(2021));
        System.out.println(cal.getClass());

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

    }
}
