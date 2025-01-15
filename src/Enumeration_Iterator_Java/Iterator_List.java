package Enumeration_Iterator_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "Html"));

        Iterator<String> iterator = list.iterator();

        System.out.println("Iterating Elements :");
        while (iterator.hasNext()) {
            String elements = iterator.next();
            System.out.println(elements);
            if (elements.equals("Python")) {
                iterator.remove();
            }
        }
        System.out.println("After modification List :" + list);
    }
}
