package Collection_Framework;

import java.util.Vector;

public class Vector_Example1 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        //adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector :" + numbers);

        //Adding first & last
        numbers.addFirst(100);
        numbers.addLast(90);
        System.out.println("After Adding :" + numbers);

        //iterate elements
        for (Integer num : numbers) {
            System.out.println(num);
        }
        //remove & get
        numbers.remove(0);
        numbers.get(0);
        System.out.println("after removing :" + numbers);
    }
}
