package Exception_Handling_Practice;

public class Q7_RuntimeException {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Runtime Exception :");

        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("caugth runtimeException :" + e.getMessage());
        }
    }
}
