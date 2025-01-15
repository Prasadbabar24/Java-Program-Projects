package Collection_Framework;

import java.util.Hashtable;

public class HashTableMap_Example1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> PL = new Hashtable<>();
        //adding
        PL.put(1, "Java");
        PL.put(2, "Python");
        PL.put(3, "Cpp");
        PL.put(4, "Html");
        System.out.println("HashTable:" + PL);

        //contain the specific Element
        System.out.println("There is 2nd Element :" + PL.contains(2));
        //get
        System.out.println("get value 4 :" + PL.get(3));
        //
        System.out.println(PL.remove(4));
        System.out.println("After removing :" + PL);


    }
}
