package zyx_Practice;

public class methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        int c;
        // zyx_Practice.methods obj=new zyx_Practice.methods();       //by calling obj method without static
        //c=obj.logic(a,b);
        c = logic(a, b);
        int a1 = 5;
        int b1 = 7;
        int c1;
        //c1=obj.logic(a1,b1);
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
