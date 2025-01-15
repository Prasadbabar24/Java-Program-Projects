package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections__class_Example1 {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>(Arrays.asList("King", "Queen", "Jack"));
        System.out.println("Before Shuffling Cards :" + cards);
        Collections.shuffle(cards);
        System.out.println("After  Shuffling cards :" + cards);

    }
}
