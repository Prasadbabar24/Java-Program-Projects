package Inheritance_Practice;

public class Employeemain {
    public static void main(String[] args) {
        Manager manager = new Manager("Prasad", 23, 30000, "Developer");
        System.out.println("Manager Name :" + manager.name);
        System.out.println("Manager Age :" + manager.age);
        System.out.println("Manager salary :" + manager.salary);
        System.out.println("Manager job :" + manager.job);
        System.out.println();

        Developer developer = new Developer("Rohit", 23, 34000, 23444);
        System.out.println("Developer name :" + developer.name);
        System.out.println("Developer age : " + developer.age);
        System.out.println("Developer salary :" + developer.salary);
        System.out.println("Developer devsalry :" + developer.devsal);
    }
}
