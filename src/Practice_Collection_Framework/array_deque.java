package Practice_Collection_Framework;

import java.util.*;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(23);
        l1.add(24);
        l1.add(25);
        l1.addFirst(22);
        l1.addLast(26);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1);

    }
}
