package Collection_Framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReplaceAllExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Krishna", "Govind", "Gopal");
        System.out.println("Names :" + names);
        Collections.replaceAll(names, "Krishna", "Krish");
        System.out.println("After replacing Names :" + names);
    }
}

