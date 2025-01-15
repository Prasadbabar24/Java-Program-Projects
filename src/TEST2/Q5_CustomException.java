package TEST2;

import java.util.Scanner;

public class Q5_CustomException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is less than 18");
        } else {
            System.out.println("Age is valid " + age);
        }
    }

    public static void main(String[] args) {
        int age = 10;
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}



