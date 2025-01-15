package Inheritance_Practice;

public class main{
    public static void main(String[] args) {
        Car car=new Car("red",120,4);
        System.out.println("Car color :"+car.color);
        System.out.println("Car Maxspeed :"+car.MaxSpeed);
        System.out.println("Car no of door :"+car.door);
        MotorCycle mc=new MotorCycle("Black",90,"curspeed");
        System.out.println("MotorCycle color :"+mc.color);
        System.out.println("MotorCycle maxspped :"+mc.MaxSpeed);
        System.out.println("MotorCycle speed "+mc.speed);

    }
}
