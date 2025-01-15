package Collection_Framework;

import java.util.HashSet;

public class HashSet_example1 {
    public static void main(String[] args) {
        HashSet<String> Fruits=new HashSet<>();
        //Adding fruits in hashset
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("chery");
        Fruits.add("Mango");
        //Displaying Hashset
        System.out.println("HashSet:"+Fruits);

        //size of the Set
        System.out.println("Size is :"+Fruits.size());

        //Removing an element
        Fruits.remove("Mango");
        System.out.println("After Removing :"+Fruits);

        //iterate
        for (String fruit :Fruits){
            System.out.println(fruit);
        }

        //clear all
        Fruits.clear();
        System.out.println("IS Empty Set :"+Fruits.isEmpty());
    }
}
