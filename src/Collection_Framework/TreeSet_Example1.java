package Collection_Framework;

import java.util.TreeSet;

public class TreeSet_Example1 {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> words = new TreeSet<>();

        // Add elements
        words.add("Banana");
        words.add("Apple");
        words.add("Cherry");

        // Elements are sorted
        System.out.println("Sorted Set: " + words);

        // Check if an element exists
        System.out.println("Contains 'Apple'? " + words.contains("Apple"));

        // Remove an element
        words.remove("Banana");
        System.out.println("After removal: " + words);
    }
}