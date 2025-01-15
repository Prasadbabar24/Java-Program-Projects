package Exception_Handling_Practice;

public class Q4_StringIndexOutofBound {
    public static void main(String[] args) {
        String str = "Prasad";
        try {
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Caugth StringIndexoutofbound :" + e.getMessage());
        }
    }
}
