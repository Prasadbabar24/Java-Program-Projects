package Polymorphism_Practice_Question.Q1;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
