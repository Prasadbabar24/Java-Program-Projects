package TEST2;

public class Q3_ExceptionHandling {
    public void numbers() {
        try {
            int divide = 10 / 0;
            System.out.println("Answer =" + divide);

            int[] array = {1, 2, 3, 4, 5};
            System.out.println("Accessing the array index :" + array[6]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("ArithmeticException : Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException : Invalid array index!");


        } finally {
            System.out.println("the program execution is complete..");
        }

    }

    public static void main(String[] args) {
        Q3_ExceptionHandling num = new Q3_ExceptionHandling();
        num.numbers();

    }
}
