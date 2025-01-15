package Encapsulation_Practice;

public class Student_Q3 {
    private int Rollno;
    private String Name;
    private int marks;

    public Student_Q3(int Rollno, String Name, int marks) {
        this.Rollno = Rollno;
        this.Name = Name;
        this.marks = marks;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student_Q3 student = new Student_Q3(1, "Prasad ", 98);
        System.out.println("Student RollNo :" + student.getRollno());
        System.out.println("Student Name :" + student.getName());
        System.out.println("Student Marks :" + student.getMarks());
    }
}
