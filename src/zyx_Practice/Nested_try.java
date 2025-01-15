package zyx_Practice;

import java.util.Scanner;
public class Nested_try {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks [0] =1;
        marks [1] = 2;
        marks [2] = 3;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("enter the index number");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome to Nested try");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this endex is out of Arrays_Program.array index");
                    System.out.println("Entering the level 2 of try");
                }
            } catch (Exception e) {
                System.out.println("exception in level 1");
            }
        }
            System.out.println("exit the program");
    }
}
