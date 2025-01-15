package Multithreadind_Practice;

class waitnotifythred extends Thread {
    private Object lock;

    public waitnotifythred(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("Thread is Waiting...");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread Notified ...");
        }
    }
}

public class Q3_wait_notify {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        waitnotifythred wnt = new waitnotifythred(lock);
        wnt.start();
        wnt.sleep(1000);
        synchronized (lock) {
            System.out.println("Notifing Thread ...");
            lock.notify();
        }

    }
}
