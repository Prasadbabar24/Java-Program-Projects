package Exception_Handling;

public class ArrayindexoutofboundException {
    public static void main(String[] args) {
        try {
            int[] number = {1, 2, 3};
            System.out.println(number[5]);  //Arrayindexoutofbound Exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bound !! ");
        } catch (Exception e) {
            System.out.println("An Error is Occurred..");
        }
    }
}
