package Multithreadind_Practice;

public class Demo2_implement_Runnable {
    public static void main(String[] args) {

        Demo2_implement_Runnableworld demo2 = new Demo2_implement_Runnableworld();
        Thread t1 = new Thread(demo2);
        t1.start();


        for (; ; ) {
            System.out.println("Hello");
//            System.out.println(Thread.currentThread().getName());
        }
    }
}
