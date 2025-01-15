package Exception_Handling;

class NevigateRadiusException extends Exception {
    public String toString() {
        return "Radius can not be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative";
    }
}

public class throws_throw {
    public static double area(int r) throws Exception {
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws Exception {

        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
