package Practice_Collection_Framework;

import java.util.*;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(10);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(9);
        l1.add(0, 8);
        l1.set(0,1);
        l1.addAll(0,l2);
        System.out.println(l1.lastIndexOf(9));
        System.out.println(l1.contains(3));
        System.out.println(l1.indexOf(3));

        //      l1.addAll();
        //l1.clear();

//        for (int i=0; i< l1.size(); i++){
//            System.out.println(l1.get(i));
//    }
        for (int i=0; i< l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ,");
        }
}
}
