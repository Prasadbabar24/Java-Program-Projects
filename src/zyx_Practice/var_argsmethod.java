package zyx_Practice;

public class var_argsmethod {
    static int sum(int x, int... arr) {
        int result = x; // result=0; if int x is not declear in var methodS
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("at least one int is passed" + sum(4));
        //System.out.println("nothing passed in the var arg then : " +sum());
        System.out.println("the sum of 4 and 5 is  :" + sum(4, 5));
        System.out.println("the sum of 6 and 7 and 8 is :" + sum(6, 7, 8));
        System.out.println("the sum of 6 and 7 and 8 and 9 is :" + sum(6, 7, 8, 9));
    }
}
