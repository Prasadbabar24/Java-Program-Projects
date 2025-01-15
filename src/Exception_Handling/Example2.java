package Exception_Handling;

import java.util.Scanner;

class myexception extends Exception {
    public String getMessage() {
        return "get Message()";
    }

    public String toString() {
        return "TO the String()";
    }
}

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Enter The Number :");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 50) {
            try {
                throw new ArithmeticException("this an Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("All finished");
        }
    }
}
