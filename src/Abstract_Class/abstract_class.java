package Abstract_Class;

abstract class parent {
    parent() {
        System.out.println("me ak Abstract_Class.parent constructor hoon");
    }

    public void sayhello() {
        System.out.println("Hello Everyone");
    }

    abstract public void greet();

    abstract public void greet2();
}

class child1 extends parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class child2 extends parent {
    child2() {
        System.out.println("i am constructor in child 2");
    }

    public void contact() {
        System.out.println("Contact me");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        // Abstract_Class.parent p = new Abstract_Class.parent(); bcz abstrct ka hum obj nahi bana sakte
        // Abstract_Class.child2 c2 = new Abstract_Class.child2(); same reasone

        child1 c1 = new child1();
        c1.greet();
        c1.greet2();
        c1.sayhello();
    }
}
