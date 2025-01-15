package Multithreading_java;

public class Runnable_Thread_class {
    public static void main(String[] args) {
        Extending_Mythread2 t1 = new Extending_Mythread2();
        Extending_Mythread2 t2 = new Extending_Mythread2();
        t1.start();
        t2.start();
    }

    public static class Extending_Mythread2 extends Thread {
        public void run() {
            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
