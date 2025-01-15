package Inheritance;

class base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("the class is Inheritance.base and setting x");
        this.x = x;
    }

    public void printme() {
        System.out.println("i am constractor");
    }
}

class derived extends base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Inheritance.derived class and setting y or x ");
        this.y = y;
    }

    public void printme() {
        System.out.println("i am constractor");
    }
}

public class inhirtance {
    public static void main(String[] args) {
        base x = new base();
        x.setX(9);
        System.out.println(x.getX());

        derived y = new derived();
        y.setY(34);
        System.out.println(y.getY());

    }
}
