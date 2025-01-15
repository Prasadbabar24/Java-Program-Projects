package Practice_Muiltithread;

class mythr1 extends Thread {
    public mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 35;
        while (true) {
            System.out.println("welcome Home.." + this.getName());
        }
    }
}

public class thread_priority {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("Prasad1");
        mythr1 t2 = new mythr1("Prasad2");
        mythr1 t3 = new mythr1("Prasad3");
        mythr1 t4 = new mythr1("Prasad4");
        mythr1 t5 = new mythr1("Prasad5 (Most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
