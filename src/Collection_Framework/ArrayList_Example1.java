package Collection_Framework;

import java.util.ArrayList;

public class ArrayList_Example1 {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Prasad");
        Names.add("Rohit");
        Names.add("Suraj");
        Names.add("Raj");
        System.out.println("List is :" + Names);
        // Iterating elements by index
        for (String name : Names) {
            System.out.println(name);
        }
        //Accessing  elements by index
        System.out.println("Getting the index name :" + Names.get(1));
        // Removing an element
        Names.remove(2);
        Names.remove("Prasad");
        System.out.println("After removing an element  : " + Names);
    }
}
