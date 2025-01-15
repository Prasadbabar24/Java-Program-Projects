package Collection_Framework;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        //Creating a LHM
        LinkedHashMap<String, String> linkedMap = new
                LinkedHashMap<>();

        // put() method to add key-value pairs
        linkedMap.put("Krishna", "Manager");
        linkedMap.put("Govind", "Developer");
        linkedMap.put("Gopal", "Tester");

        //get() method - Retrieves value by key
        System.out.println("Role of Krishna : " + linkedMap.get("Krishna"));

        //containsKey()
        System.out.println(linkedMap.containsKey("Gopal"));

        //containsValue()
        System.out.println(linkedMap.containsValue("Tester"));

        //remove()
        System.out.println("After Removing:" + linkedMap.remove("Krishna"));

        //keySet()

        //values() method - Get all values
        System.out.println("Values : " + linkedMap.values());

        //entrySet()
    }
}

