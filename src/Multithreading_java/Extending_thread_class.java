package Multithreading_java;

public class Extending_thread_class {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Starts the thread and calls the run() method.
        thread2.start();

    }

    public static class MyThread extends Thread{
        public void run(){
            System.out.println("Thread is running : "+ Thread.currentThread().getName());
        }
    }
}

