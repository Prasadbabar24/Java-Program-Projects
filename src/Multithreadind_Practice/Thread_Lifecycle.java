package Multithreadind_Practice;

public class Thread_Lifecycle extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING"); //Runnable state
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_Lifecycle t1 = new Thread_Lifecycle(); // new state
        System.out.println(t1.getState());
        t1.start(); // runnable state
        System.out.println(t1.getState());
        Thread.sleep(1000); //Waiting state
        System.out.println(t1.getState());
        t1.join(); // terminated state
        System.out.println(t1.getState());

    }
}
