package Inheritance;

class base1 {
    base1() {
        System.out.println("i am a constructor");
    }

    base1(int x) {
        System.out.println(" i am a overloded Inheritance.base class constructor with value of x is :" + x);
    }
}

class derived1 extends base1 {
    derived1() {
        System.out.println("i am Inheritance.derived class constructor");
    }

    derived1(int x, int y) {
        super(x);
        System.out.println(" i am a overloded Inheritance.derived class constructor with value of y is :" + y);
    }
}

class childclass extends derived1 {
    childclass() {
        System.out.println("i am a child class constructor");
    }

    childclass(int x, int y, int z) {
        super(x, y);
        System.out.println("i am a overloded child class constuctor with value of z : " + z);
    }
}

public class constructor_in_inheristance {
    public static void main(String[] args) {
        // Inheritance.base1 b = new Inheritance.base1();
//        Inheritance.derived1 d = new Inheritance.derived1();
        //Inheritance.derived1 d = new Inheritance.derived1(10,20);
//        Inheritance.childclass cd = new Inheritance.childclass();
        childclass cd = new childclass(10, 20, 30
        );
    }
}
