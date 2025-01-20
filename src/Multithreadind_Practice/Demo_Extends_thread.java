package Multithreadind_Practice;

public class Demo_Extends_thread {
    public static void main(String[] args) {

        world_extends world = new world_extends();
        world.start();

        for (; ; ) {
            System.out.println("Hello");
        }
    }
}
