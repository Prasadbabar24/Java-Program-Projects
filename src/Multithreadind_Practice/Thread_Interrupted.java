package Multithreadind_Practice;

public class Thread_Interrupted extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is Running ..");
        } catch (InterruptedException e) {
            System.out.println("Thread Interruped..." + e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_Interrupted interrupted = new Thread_Interrupted();
        interrupted.start();
        interrupted.interrupt();
    }
}
