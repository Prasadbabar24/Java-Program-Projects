package Exception_Handling;

public class finally_block_example {
    public static int greet() {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("this is the end of the program");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 9;
        int b = 7;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("this is finally block value =" + b);
            }
            b--;
        }
        try {
            System.out.println(5 / 0);
        } finally {
            System.out.println("this is the last finally7 block");
        }
    }
}
