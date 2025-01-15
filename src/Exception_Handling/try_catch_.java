package Exception_Handling;

public class try_catch_ {
    public static void main(String[] args) {
//        without try
        int a = 50;
        int b = 0;
//        int c = a / b;
//        System.out.println("the divided value is :" + c);

        //with try catch
        try {
            int c = a / b;
            System.out.println("the divided value is :" + c);
        } catch (Exception e) {
            System.out.println("the divided value is in error , Reason");
            System.out.println(e);
        }
        System.out.println("the program is end");
    }
}
