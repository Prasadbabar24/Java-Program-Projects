package Polymorphism_Practice_Question.Q1;

public class Q2 {
    public static void main(String[] args) {
//        Circle circle = new Circle(4);
//        Rectangle rectangle = new Rectangle(2, 4);
//        Triangle triangle = new Triangle(6);
//        System.out.println("Circle Area is :" + circle.area());
//        System.out.println("Rectangle Area is :" + rectangle.area());
//        System.out.println("triangle Area is :" + triangle.area());
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(4);
        shape[1] = new Rectangle(2, 3);
        shape[2] = new Triangle(6);

        for (Shape shape1 : shape) {
            System.out.println("Area" + shape1.area());
        }
    }
}
