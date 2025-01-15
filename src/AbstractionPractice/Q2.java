package AbstractionPractice;

abstract class Vehical {
    abstract void StartEngine();

    abstract void Accelerate();
}

public class Q2 {
    public static void main(String[] args) {
        Car car = new Car();
        MoterCycle moterCycle = new MoterCycle();
        car.StartEngine();
        car.Accelerate();
        moterCycle.StartEngine();
        moterCycle.Accelerate();
    }
}
