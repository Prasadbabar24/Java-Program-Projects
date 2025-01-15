package Exception_Handling;

public class Methods_For_Printing_Exception_info {
    public static void main(String[] args) {
        try {
            int divison = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();  // prints detailed information about the exception & its origin
            System.out.println(e.toString()); //Provides a short description of the exception, showing the class name and message
            System.out.println(e.getMessage()); //Just a message
        }
    }
}
