package Inheritance;

class circle {
    public int radius;

    circle() {
        System.out.println("i am a non para constructor");
    }

    circle(int r) {
        System.out.println("I am a parameterized constructor in Inheritance.circle");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder2 extends circle {
    public int height;

    Cylinder2(int r, int h) {
        super(r);
        System.out.println("I am a paramitised constructor in cylinder");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class ps_inherittance {
    public static void main(String[] args) {
//        Inheritance.circle c = new Inheritance.circle(34);
//        Inheritance.circle c = new Inheritance.circle();
        Cylinder2 c2 = new Cylinder2(6, 7);
    }
}
