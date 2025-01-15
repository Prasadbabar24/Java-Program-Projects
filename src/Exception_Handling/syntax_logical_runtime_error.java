package Exception_Handling;

import java.util.Scanner;

public class syntax_logical_runtime_error {
    public static void main(String[] args) {
        //syntax Error
        //int a=5
        // b = 10;

        //Logical Error
        System.out.println("2");
        for (int i =1; i<5; i++){
            System.out.println(2*i+1);
        }
//        runtime error
        int k;
        System.out.println("enter the no =:");
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("k is divided by 1000" +1000/k);
    }
}
