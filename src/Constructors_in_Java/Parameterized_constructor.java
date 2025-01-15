package Constructors_in_Java;

public class Parameterized_constructor {
    String Name;
    int RollNo;

    public Parameterized_constructor(String Name, int RollNo) {
        this.Name = Name;
        this.RollNo = RollNo;
    }

    public void Display() {
        // System.out.println("Name :" + Name + " Roll NO :" + RollNo);
        System.out.println("Name :"+Name);
        System.out.println("RollNO :"+RollNo);
    }

    public static void main(String[] args) {
        Parameterized_constructor ps = new Parameterized_constructor("Prasad", 01);
        ps.Display();
    }
}