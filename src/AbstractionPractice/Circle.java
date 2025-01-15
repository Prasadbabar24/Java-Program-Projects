package AbstractionPractice;

class Circle extends shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculatearea(){
        System.out.println("circle area calculete");
        return Math.PI*radius*radius;
    }
}
