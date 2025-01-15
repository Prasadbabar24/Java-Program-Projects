package Exception_Handling;

class CustomMessage extends Exception {
    public CustomMessage(String message) {
        super(message);
    }
}

public class Main {
    public static void cheakvalue(int value) throws CustomMessage {
        if (value < 0) {
            throw new CustomMessage("Value can not be negative..");
        }
        System.out.println("Value :" + value);
    }

    public static void main(String[] args) {
        try {
            cheakvalue(-5);
        } catch (CustomMessage e) {
            System.out.println("Catch Exception :" + e.getMessage());
        }
    }
}


