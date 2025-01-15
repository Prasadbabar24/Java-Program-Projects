package Polymorphism_Practice_Question.Q1;

class Triangle extends Shape {
    public double radius;

    public Triangle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3 * Math.PI * radius;
    }
}
