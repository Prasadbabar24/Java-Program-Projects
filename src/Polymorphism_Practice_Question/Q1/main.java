package Polymorphism_Practice_Question.Q1;

class Animal {
    void sound() {
        System.out.println("Animal sounds :");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Sound Mau Mau...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Sound : Bhau bhau....");
    }
}

public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
