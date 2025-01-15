package Inheritance_Practice;

public class Employee_Q2 {
    String name;
    int age;
    double salary;

    public Employee_Q2(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
class Manager extends Employee_Q2{
    String job;

    public Manager(String name, int age, double salary,String job) {
        super(name, age, salary);
        this.job=job;
    }
}
class Developer extends Employee_Q2{
    int devsal;

    public Developer(String name, int age, double salary,int devsal) {
        super(name, age, salary);
        this.devsal=devsal;
    }
}
