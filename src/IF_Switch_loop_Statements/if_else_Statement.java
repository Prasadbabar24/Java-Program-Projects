package IF_Switch_loop_Statements;

import java.util.Scanner;

public class if_else_Statement {
    public static void main(String[] args) {
        System.out.println("If Else Program :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You can Vote ...");
        } else {
            System.out.println("You Are Below 18, You can not Vote ..");
        }
    }
}
