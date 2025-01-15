package IF_Switch_loop_Statements;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();
        if (num > 1) {                         //Check if The Number is Greater than 1.
            boolean CheckPrime = true;
            for (int i = 2; i < num; i++) {    // Loop Number from 2 to the given number
                if (num % i == 0) {            //Check if the given number is division by i:
                    CheckPrime = false;       
                    break;
                }
            }
            if (CheckPrime) {
                System.out.println("Is a Prime Number :" + num);
            } else {
                System.out.println("Is Not a Prime Number :" + num);
            }
        }
    }
}
