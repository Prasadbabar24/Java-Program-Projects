package Multithreadind_Practice;

public class Demo2_implement_Runnableworld implements Runnable {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }
}
