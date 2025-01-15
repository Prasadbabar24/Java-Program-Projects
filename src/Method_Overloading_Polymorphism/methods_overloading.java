package Method_Overloading_Polymorphism;

public class methods_overloading {
    static void f00() {
        System.out.println("good morniing bro");
    }

    static void foo(String a) {
        System.out.println("good morning  " + a + " bro");
    }

    static void foo(char x, char y) {
        System.out.println("good morning " + x + " bro");
        System.out.println("good morning " + y + " bro");
    }

//    static void change1(int a) {
//        a = 67;
//    }
//
//    static void change2(int[] arr) {
//        arr[0] = 99;
//    }
//
//    static void newjoke() {
//        System.out.println("hello everyone Good morning");
//    }

    public static void main(String[] args) {
//        newjoke();
//        int x=98;
//        change1(x);
//        System.out.println("there is any value is change =" +x);
//
//        int [] marks = {67,89,97,45,78};
//        change2(marks);
//        System.out.println(marks[0]);

//        Method_Overloading_Polymorphism.methods_overloading example
        f00();
        foo("Prasad");
        foo('p', 'r');
    }
}
