package Exception_Handling_Practice;

public class Q1_Arithmentic {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Result :" + a);
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();//for detailed explanation
        }
    }
}
