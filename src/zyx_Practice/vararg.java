package zyx_Practice;

public class vararg {
    public static void m1(int...x) {
        System.out.println("Number of arguments:"+x.length);
        for (int i : x)
            System.out.println(i + "");
        System.out.println();
    }
    public static void main(String[] args) {
        m1();
        m1(10,20);
        m1(10,20,30,40,50);
    }
}