package Practise_Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class ps_dateandtime {
    public static void main(String[] args) {
        //ps q1
        ArrayList ar = new ArrayList();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        ar.add("student 7");
        ar.add("student 8");
        ar.add("student 9");
        ar.add("student 10");

        for (Object o : ar){
            System.out.println(o);
        }

        //ps Q2
        Date d = new Date();
        System.out.println(d.getHours()+":"+ d.getMinutes()+":"+d.getSeconds());

        //ps Q3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //ps Q4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy--E H:m a");
        String mydate = dt.format(df);
        System.out.println(mydate);

        // ps Q5
        HashSet<Integer> hs = new HashSet();
        hs.add(23);
        hs.add(67);
        hs.add(65);
        hs.add(45);
        System.out.println(hs);
    }
}
