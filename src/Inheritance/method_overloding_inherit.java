package Inheritance;

class A{
    int a;
    public int math1(){
        return 5;
    }
    public void meth2(){
        System.out.println("method 2 class Inheritance.A");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("i am method 2 with class Inheritance.B");
    }
    public void meth3(){
        System.out.println(" method 3 with class Inheritance.B");
    }
}

public class method_overloding_inherit {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
//        a.meth2();
//        b.meth2();
        b.meth2();

    }
}
