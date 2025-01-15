package Exception_Handling;

import java.util.Scanner;

public class ps_error {
    public static void main(String[] args) {

        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("hehe");
        } catch (IllegalArgumentException e) {
            System.out.println("haha");
        }

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 5;
        marks[1] = 56;
        marks[2] = 7;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the Array Index :");
                index = sc.nextInt();
                System.out.println("the value of marks[index] is :" + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalide Index");
                i++;
            }
        }
        System.out.println("errror");
    }
}
