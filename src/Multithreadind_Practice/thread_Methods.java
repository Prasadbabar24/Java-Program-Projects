package Multithreadind_Practice;

public class thread_Methods extends Thread {
    public thread_Methods(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is Running");
            Thread.yield();

//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        thread_Methods t1 = new thread_Methods("T1");
        thread_Methods t2 = new thread_Methods("T2");
        t1.start();
        t2.start();
//        t1.setDaemon(true);
//        t2.setDaemon(true);
//        System.out.println("Main done");

//        thread_Methods methods = new thread_Methods();
//        methods.start();
//        //Thread.sleep(1000);
//        methods.join();
//        System.out.println("Hello");
    }
}
