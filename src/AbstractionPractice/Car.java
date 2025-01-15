package AbstractionPractice;

public class Car extends Vehical {
    @Override
    void StartEngine() {
        System.out.println("car engine Start");
    }

    @Override
    void Accelerate() {
        System.out.println("Car acclerate on");
    }
}
