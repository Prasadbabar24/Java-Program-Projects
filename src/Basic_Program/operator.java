package Basic_Program;

public class operator {
    public static void main(String[] args) {
        //relational Basic_Program.operator (<, >, <=, >= )
        System.out.println("Relational operaor :");
        int a = 10;
        int b = 20;
        System.out.println("less than (a<b) : " + (a<b));
        System.out.println("greater than (a>b) : " + (a>b));
        System.out.println("less than equal to (a<=b) : " + (a<=b));
        System.out.println("greater than equal to (a<=b) : " + (a>=b));

        //equality Basic_Program.operator (==, !=)
        System.out.println("Equality Operator");
        String s1 = "Hi";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = "Hi";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);
        System.out.println(s1.equals(s4));
        System.out.println(s1 != s2);

        //Bitwise Operator ( & , | , ^ )
        System.out.println("Bitwise Operator :");
        System.out.println(10 & 20);
        System.out.println(10 | 20);
        System.out.println(10 ^ 20);
        System.out.println(~20);

        //Instanceof Operator
        System.out.println("Instanceof Operator : ");
        Thread t = new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
    }
}
