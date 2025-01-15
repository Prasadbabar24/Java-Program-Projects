package Inheritance_Practice;

public class Vehical_Q1 {
    String color;
    int MaxSpeed;
    public Vehical_Q1(String color,int MaxSpeed){
        this.color=color;
        this.MaxSpeed=MaxSpeed;
    }
}
class Car extends Vehical_Q1{
    int door;

    public Car(String color, int MaxSpeed,int door) {
        super(color, MaxSpeed);
        this.door=door;
    }
}
class MotorCycle extends Vehical_Q1{
    String speed;
    public MotorCycle(String color,int MaxSpeed,String spped){
        super(color,MaxSpeed);
        this.speed=spped;
    }
}
