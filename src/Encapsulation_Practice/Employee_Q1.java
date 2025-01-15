package Encapsulation_Practice;

public class Employee_Q1 {
    private String name;
    private int age;
    private double salary;

    public Employee_Q1(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee_Q1 employee = new Employee_Q1("Babar",45,3400.0);
//        employee.setName("Prasad");
//        employee.setAge(23);
//        employee.setSalary(3000.00);
        System.out.println("Employee Name :" + employee.getName());
        System.out.println("Employee Age :" + employee.getAge());
        System.out.println("Employee Salary :" + employee.getSalary());
    }
}
