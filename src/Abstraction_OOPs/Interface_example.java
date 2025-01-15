package Abstraction_OOPs;

interface Vehical {
    void move();
}

class cycle implements Vehical {
    @Override
    public void move() {
        System.out.println("Cycle is Moving...");
    }
}

public class Interface_example {
    public static void main(String[] args) {
        Vehical vc = new cycle();
        vc.move();
    }
}
