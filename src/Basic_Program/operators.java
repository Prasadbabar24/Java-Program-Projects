package Basic_Program;

public class operators {
    public static void main(String[] args) {
        //Arithmatic Operator...

        int x=20;
        int y=10;
        System.out.println(x + y);  //Addition (+).
        System.out.println(x - y);  //Addition (-).
        System.out.println(x * y);  //Addition (*).
        System.out.println(x / y);  //Addition (/).
        System.out.println(x % y);  //Addition (%).


        System.out.println("Increment  & Decrement");
        //1. pre-increment
        //2. post-increment
        System.out.println("pre-increment");
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("post- increment");
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        //pre-decrement
        System.out.println("pre-decrement");
        int e = 20;
        int f = --c;
        System.out.println(e);
        System.out.println(f);

        //post-decrement
        System.out.println("post-decrement");
        int g = 20;
        int h = g--;
        System.out.println(g);
        System.out.println(h);


        //NaN
        System.out.println(0/0.0);
        System.out.println(5.0 % 0);

        //zyx_Practice.string concatination
        System.out.println("zyx_Practice.string concatination");
        int p = 10;
        int q = 20;
        int r = 30;
        String s = "Hello";

        System.out.println(p+q+r+s);
        System.out.println(q+r+s+p);
        System.out.println(r+s+p+q);
        System.out.println(s+p+q+r);

        // (+) infinity (-) infinity
        System.out.println("positive and negative infinity");
        int num1 = 1;
        System.out.println(num1/0.0);
        System.out.println(-num1/0.0);

    }
}
