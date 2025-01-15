package Basic_Program;

public class All_Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 20;
        int b = 10;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Assignment Operators
        int c = 30;
        System.out.println("Assignment Operators:");
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 2;
        System.out.println("c -= 2: " + c);
        c *= 3;
        System.out.println("c *= 3: " + c);
        c /= 4;
        System.out.println("c /= 4: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);

        // 4. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 5. Bitwise Operators
        int p = 9;
        int q = 5;
        System.out.println("Bitwise Operators:");
        System.out.println("p & q: " + (p & q));
        System.out.println("p | q: " + (p | q));
        System.out.println("p ^ q: " + (p ^ q));
        System.out.println("~p: " + (~p));
        System.out.println("p << 1: " + (p << 1));
        System.out.println("p >> 1: " + (p >> 1));
        System.out.println("p >>> 1: " + (p >>> 1));

        // 6. Unary Operators
        int d = 10;
        System.out.println("Unary Operators:");
        System.out.println("d: " + d);
        System.out.println("++d: " + (++d));
        System.out.println("d++: " + (d++));
        System.out.println("--d: " + (--d));
        System.out.println("d--: " + (d--));
        System.out.println("-d: " + (-d));
        System.out.println("+d: " + (+d));
        System.out.println("!x: " + (!x));

        // 7. Ternary Operator
        int result = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("result (a > b ? a : b): " + result);

        // 8. instanceof Operator
        String str = "Hello,Java!";
        boolean isString = str instanceof String;
        System.out.println("instanceof Operator:");
        System.out.println("str instanceof String: " + isString);
    }
}
