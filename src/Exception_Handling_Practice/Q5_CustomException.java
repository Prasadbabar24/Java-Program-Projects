package Exception_Handling_Practice;

public class Q5_CustomException {
    public static void main(String[] args) {
        try {
            throw new InsufficientBalanceException("Insufficient Balance");
        } catch (InsufficientBalanceException e) {
            System.out.println("Caugth InsufficientBalanceException :" + e.getMessage());
        }
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
