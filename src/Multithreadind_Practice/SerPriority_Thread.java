package Multithreadind_Practice;

public class SerPriority_Thread extends Thread {
    public SerPriority_Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            for (int j = 0; j < 10000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + "- Priority name ," + Thread.currentThread().getPriority() + "- Count " + Thread.activeCount());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SerPriority_Thread l = new SerPriority_Thread("Low Priority Thread");
        SerPriority_Thread m = new SerPriority_Thread("Medium Priority Thread");
        SerPriority_Thread h = new SerPriority_Thread("high Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();


    }
}
