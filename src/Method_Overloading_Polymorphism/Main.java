package Method_Overloading_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers : " + calc.add(10, 40));
        System.out.println("Sum of three numbers : " + calc.add(10, 30, 50));

    }
}
