package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection_Class_Example2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(10, 30, 50, 20, 40));
        System.out.println("list :" + num);
        System.out.println("Minmun number is :"+Collections.min(num));
        System.out.println("Maximun :" + Collections.max(num));


    }
}
