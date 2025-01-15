package Collection_Framework;

import java.util.LinkedHashSet;

public class LinkedHashSet_Example1 {
    public static void main(String[] args) {
        LinkedHashSet<String> Cities = new LinkedHashSet<>();
        Cities.add("Surat");
        Cities.add("Delhi");
        Cities.add("Pune");
        Cities.add("mumbai");
        System.out.println("LinkedHashSet :" + Cities);

        Cities.addFirst("Shipur");
        Cities.addLast("Miraj");
        System.out.println("After Adding Elements :" + Cities);
        Cities.getFirst();
        Cities.getLast();
        Cities.removeFirst();
        Cities.removeLast();
        System.out.println("After Removing :" + Cities);
        System.out.println(Cities.contains("Pune"));
        System.out.println(Cities.size());

        for (String city : Cities) {
            System.out.println(city);
        }

    }
}
