package Abstraction_OOPs;

abstract class shape{
    abstract void draw();
}
class Circle extends shape{
    @Override
    void draw() {
        System.out.println("Draw Circle Shape..");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
        shape myshape=new Circle();
        myshape.draw();
    }
}
