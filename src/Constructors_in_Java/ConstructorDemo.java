package Constructors_in_Java;

// Example Default and Parameterized Constructors
class Example {
    int id;
    String name;

    // Default Constructor
    Example() {
        id = 0;
        name = "Default Name";
    }

    // Parameterized Constructor
    Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display the object details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Using Default Constructor
        Example obj1 = new Example();
        obj1.display();

        // Using Parameterized Constructor
        Example obj2 = new Example(101, "Prasad Babar");
        obj2.display();
    }
}

