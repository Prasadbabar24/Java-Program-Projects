package Exception_Handling;

public class Throwing_an_Exception {
    public static void cheakage(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Access Granted ..");
    }

    public static void main(String[] args) {
        try {
            cheakage(16);   // Throws IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught:" + e.getMessage());
        }
    }
}
