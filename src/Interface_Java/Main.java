package Interface_Java;

interface Animal {
    //Abstract Method(No implementation)
    void sound();
}

//Dog class implements the Animal Interface
class Dog implements Animal {
    //providing the implementation of the abstract method
    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class Main {
    public static void main(String[] args) {
//Create an instance of dog
        Dog myDog = new Dog();
        // Call the sound method (Defined in Animal, implemented in Dog)
        myDog.sound();
    }
}


//interface Animal {
//    void sound();
//}
//
//class Dog implements Animal {
//    @Override
//    public void sound() {
//        System.out.println("Dog Barks");
//    }
//}
//
//public class interface_Ex {
//    public static void main(String[] args) {
//        Dog mydog = new Dog();
//        mydog.sound();
//    }
//}
