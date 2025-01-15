package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyExample {
    public static void main(String[] args) {
        List<String> source = Arrays.asList("A", "B", "C");
        List<String> destination = new ArrayList<>(Arrays.asList("", "", ""));
        Collections.copy(destination, source);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);


        List<Integer> sourcenum = Arrays.asList(1, 2, 3);
        List<Integer> destinationnum = new ArrayList<>(Arrays.asList(0, 0, 0));
        Collections.copy(destinationnum, sourcenum);
        System.out.println("Source : " + sourcenum);
        System.out.println("Destination : " + destinationnum);

    }
}

