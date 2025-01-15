package Practice_Collection_Framework;

import java.util.*;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.addAll(0,l2);
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(12));
        System.out.println(l1.contains(4));
        l1.addFirst(455);
        l1.addLast(554);
        for (int i=0; i< l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
