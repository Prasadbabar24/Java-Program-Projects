package Multithreadind_Practice;

public class world_extends extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }
}
