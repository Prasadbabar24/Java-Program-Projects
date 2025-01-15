package AbstractionPractice;

public class Q1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        rectangle rectangle = new rectangle(3, 2);
        System.out.println("Circle area is :" + circle.calculatearea());

        System.out.println("rectangle area is :" + rectangle.calculatearea());


    }
}
