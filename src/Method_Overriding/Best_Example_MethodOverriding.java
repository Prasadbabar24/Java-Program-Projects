package Method_Overriding;

class Animal{
    void sound(){
        System.out.println("Animal Makes a Sound....");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println(" Maow Mow Maow");
    }
}
public class Best_Example_MethodOverriding {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.sound();
    }
}
