package TEST2;

import java.util.HashMap;

public class Q1_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Prasad");
        map.put(2, "Pratik");
        map.put(3, "Sumit");
        map.put(4, "Raj");
        System.out.println("Keys & Values are :" + map);
        //Retrieve and print all keys.
        System.out.println("keys  :" + map.keySet());

        //Retrieve and print all values.
        System.out.println("Values :" + map.values());

        //• Check if a specific key exists in the map.
        System.out.println("Cheak Key exist or not :" + map.containsKey(3));

        //• Remove a key-value pair and print the updated map.
        map.remove(2, "Pratik");
        System.out.println("Remove Key-Value pair :" + map);


    }
}
