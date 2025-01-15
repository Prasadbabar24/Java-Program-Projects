package Enumeration_Iterator_Java;

import java.util.*;

public class ListIterator_List {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "Html"));

        ListIterator<String> listiterator = languages.listIterator();

        System.out.println("Forword Traversal :");
        while (listiterator.hasNext()) {
            System.out.println(listiterator.next());
        }

        System.out.println("\nBackword Traversal :");
        while (listiterator.hasPrevious()) {
            System.out.println(listiterator.previous());
        }

    }
}
