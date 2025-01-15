package Exception_Handling;

public class Finally_Block {
    public static void main(String[] args) {
        try {
            int num = 10 / 2;
            System.out.println("Result :" + num);
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by Zero ;" + e);
        } finally {
            System.out.println("Execution Successfully !");
        }
    }
}
