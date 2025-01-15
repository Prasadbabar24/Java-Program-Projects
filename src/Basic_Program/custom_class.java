package Basic_Program;

class employee {
        int id;
        int salary;
        String name;

        public void printdetails() {
            System.out.println("the id is :>"+ id);
            System.out.println("the name is "+name);
            System.out.println("my salary is : "+salary);
        }
    }
public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is a custom class");
        employee prasad = new employee();
        employee rohit = new employee();

        prasad.name ="Prasadbabar";
        prasad.id =01;
        prasad.salary=45;

        rohit.name = "rohitsaste";
        rohit.id= 02;
        rohit.salary=30;

        prasad.printdetails();
        rohit.printdetails();
    }
}
