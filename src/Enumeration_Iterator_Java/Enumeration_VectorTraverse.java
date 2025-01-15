package Enumeration_Iterator_Java;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_VectorTraverse {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Raj");
        names.add("Prasad");
        names.add("rohit");
        names.add("suraj");
        //Get Enumerating
        Enumeration<String> enumeration = names.elements();
        //Traversing the Element
        System.out.println("Elements in vector :");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
