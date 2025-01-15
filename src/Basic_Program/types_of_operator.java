package Basic_Program;

public class types_of_operator {
    public static void main(String[] args) {
        // Short Circuit Operator
            //(&&, || )
        System.out.println("Short Circuit Operator");
        int x = 10;
        int y = 20;
        System.out.println("Logical AND Operator");
        if (x++ < 10 && ++y >20){
            x++;
        }
        else {
            y++;
        }
        System.out.println("value of x :" +x);
        System.out.println("value of y :" + y);
        System.out.println("Logical OR Operator");
        if (x++ < 10 || ++y >20){
            x++;
        }
        else {
            y++;
        }
        System.out.println("value of x :" +x);
        System.out.println("value of y :" + y);

        //Type cast Basic_Program.operator
        //1. implicit Type Cast
        //2. Explicit Type Cast
        System.out.println("Implicit cast Basic_Program.operator");
        int a = 5;
        float b = a;
        System.out.println("Implicit cast :" +b);

        System.out.println("Explicit cast Basic_Program.operator");
        double c = 10.5;
        int d = (int)c;
        System.out.println("Explicit cast :" +d);

        //Assignment Operator
        // 1. simple 2. Chained 3.Compound
        System.out.println("Simple Assignment Operator");
        int p = 100;
        System.out.println("value of p :"+p);

        System.out.println("Chained Assignment Operator");
        int q,r,s;
        q=r=s=50;
        System.out.println("q :"+q);
        System.out.println("r :"+r);
        System.out.println("s :"+s);

        System.out.println("Compound Assignment Operator");
        int cm1 = 30;
        cm1 +=20;
        System.out.println("compound value :"+cm1);
    }
}
