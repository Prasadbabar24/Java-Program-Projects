package AbstractionPractice;

public class rectangle extends shape {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculatearea() {
        System.out.println("Rectanglr area calulate");
        return length * width;
    }
}
