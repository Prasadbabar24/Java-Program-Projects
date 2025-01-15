package IF_Switch_loop_Statements;

import java.util.Scanner;

public class Switch_Case_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter The Character :");
        ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("This is Vowel...");
                    break;
                default:
                    System.out.println("This is Consonant..");

            }
        }
        else {
            System.out.println("This Is Not A Alphabet..");
        }
    }
}