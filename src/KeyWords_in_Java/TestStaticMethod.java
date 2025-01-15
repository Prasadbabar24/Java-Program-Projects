package KeyWords_in_Java;

class StaticMethodExample {
    static void showMessage() {
        System.out.println("This is a static method.");
    }
}

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethodExample.showMessage(); // Calling the static method without creating an object
    }
}

