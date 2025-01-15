package Exception_Handling_Practice;

public class Q6_NumberFormatexception {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Caught Number Format Exception :" + e.getMessage());
        }
    }
}
