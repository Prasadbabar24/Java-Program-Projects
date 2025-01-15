package TEST;

import java.util.ArrayList;
import java.util.Collections;

public class Q1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        numbers.add(10);
        System.out.println("Numbers :" + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("descending order" + numbers);
    }
}
