package KeyWords_in_Java;

class Example {
        int id;
        String name;

        // Constructor
        Example(int id, String name) {
                this.id = id; // Refers to the instance variable
                this.name = name;
        }

        void display() {
                System.out.println("ID: " + id + ", Name: " + name);
        }
}

public class TestThis {
        public static void main(String[] args) {
                Example obj = new Example(101, "Prasad");
                obj.display();
        }
}

