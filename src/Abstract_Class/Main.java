package Abstract_Class;

//Abstract Class
abstract class Vehicle{
    //Abstract Method(No implementation)
    abstract void start();

    //Non-abstract method (With Implementation)
    void stop(){
        System.out.println("Vehicle Stopped");
    }
}

//Subclass Car extends the abstract class Vehicle
class Car extends Vehicle{
    //Providing the implementation of the abstract zyx_Practice.methods
    void start(){
        System.out.println("Car Started");
    }
}

//Main class
public class Main{
    public static void main(String[] args){
        // Create an instance of Car class
        Car myCar = new Car();

        // Call the start method (from car class)
        myCar.start();

        // Call the stop method (Inherited from Vehicle class)
        myCar.stop();
    }
}
