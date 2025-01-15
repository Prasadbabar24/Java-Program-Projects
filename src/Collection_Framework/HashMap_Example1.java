package Collection_Framework;

import java.util.HashMap;

public class HashMap_Example1 {
    public static void main(String[] args) {
        //Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        //put() method to add key-value pairs
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Cherry", 75);

        //get() method to retrieve value by key
        System.out.println("Price of Banana : " + map.get("Banana"));

        //containsKey() method to check if key exists
        System.out.println("Does it contains 'Apple '? " + map.containsKey("Apple"));

        //containsValue()
        System.out.println("Does it contains '75 '? " + map.containsValue(75));

        //remove()
        System.out.println("After Removing :" + map.remove("Cherry"));

        // values() method to get all values
        System.out.println("Values : " + map.values());

        //entrySet() method to get all key-value pairs
        System.out.println("Entries : " + map.entrySet());

    }
}
