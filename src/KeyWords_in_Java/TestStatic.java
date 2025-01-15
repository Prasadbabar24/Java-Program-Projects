package KeyWords_in_Java;

class StaticExample {
    static int count = 0; // Static variable

    StaticExample() {
        count++; // Increment count whenever a new object is created
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class TestStatic {
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        obj1.displayCount();
        obj2.displayCount();
        obj3.displayCount();
    }
}

