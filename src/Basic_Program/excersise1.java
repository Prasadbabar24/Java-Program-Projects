package Basic_Program;

import java.util.Scanner;
public class excersise1 {
    public static void main(String[] args) {
        System.out.println("student of CBSC Result :");
        Scanner sc = new Scanner(System.in);
        System.out.println("English Marks :");
        int a= sc.nextInt();
        System.out.println(" Marathi Marks :");
        int b= sc.nextInt();
        System.out.println("Hindi Marks :");
        int c= sc.nextInt();
        System.out.println(" Maths Marks :");
        int d= sc.nextInt();
        System.out.println("Science Marks :");
        int e= sc.nextInt();
        float total= a+b+c+d+e;
        System.out.println("Total Marks ="+total);
        float percentage= total*100/500;
        System.out.println("Percentage ="+percentage);
    }
}
