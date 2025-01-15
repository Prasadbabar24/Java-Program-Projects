package Multithreading_java;

public class Thread_LifeCycle {
    public static void main(String[] args) {
        //thred is in new state
        Mythred1 t1 = new Mythred1();
        System.out.println("Thread is new state :");

        //moves to the runnable state
        t1.start();
        System.out.println("Thread is runnable state :");

        //Main thread waits for the thread to complete
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is terminated :");
    }

    public static class Mythred1 extends Thread {
        @Override
        public void run() {
            System.out.println("Thread is in Running  state :");
            try {
                Thread.sleep(1000); //thred is move to wait state
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupter" + e.getMessage());
            }
            System.out.println("Thread is about to terminated..");
        }
    }
}
