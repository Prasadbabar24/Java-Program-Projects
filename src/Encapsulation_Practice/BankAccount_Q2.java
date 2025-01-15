package Encapsulation_Practice;

public class BankAccount_Q2 {
    private double AcNo;
    private String AcHolderName;
    private double balance;

    public BankAccount_Q2(double AcNo, String AcHolderName, double balance) {
        this.AcNo = AcNo;
        this.AcHolderName = AcHolderName;
        this.balance = balance;
    }

    public double getAcNo() {
        return AcNo;
    }

    public void setAcNo(double acNo) {
        AcNo = acNo;
    }

    public String getAcHolderName() {
        return AcHolderName;
    }

    public void setAcHolderName(String acHolderName) {
        AcHolderName = acHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {

        BankAccount_Q2 bank = new BankAccount_Q2(96740063, "Prasad Babar", 100000.00);
        System.out.println("Account No :" + bank.getAcNo());
        System.out.println("Account Holder Name :" + bank.getAcHolderName());
        System.out.println("Account Balance :" + bank.getBalance());
    }
}
