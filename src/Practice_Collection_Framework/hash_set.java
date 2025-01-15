package Practice_Collection_Framework;

import java.util.HashSet;

public class hash_set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(23);
        hs.add(26);
        hs.add(25);
        hs.add(24);
        hs.add(24);
        System.out.println(hs);
    }
}
