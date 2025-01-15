package Exception_Handling;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        try {
            int div = 10 / 0;
            System.out.println("Result :"+div);
        } catch (ArithmeticException e) {
            System.out.println("You Can Not Divide by Zero.." + e);
        }
    }
}
