package Interface_Java;

interface Engine {
    void start();
}

interface wheel {
    void rotate();
}

class car implements Engine, wheel {
    @Override
    public void start() {
        System.out.println("starts the Engine..");
    }

    @Override
    public void rotate() {
        System.out.println("Rotate the Wheel...");
    }
}

public class Multiple_Interfaces {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.start();
        mycar.rotate();
    }
}
