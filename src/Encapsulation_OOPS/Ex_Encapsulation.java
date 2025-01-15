package Encapsulation_OOPS;

class person{
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
public class Ex_Encapsulation {
    public static void main(String[] args) {
        person person=new person();
        person.setName("Prasad");
        System.out.println(person.getName());
    }
}
