package Exception_Handling_Practice;

public class Q2_NullPointer {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            //System.out.println(e);
            //e.printStackTrace();
            System.out.println("Caught Null Pointer Exception" + e.getMessage());
        }
    }
}
