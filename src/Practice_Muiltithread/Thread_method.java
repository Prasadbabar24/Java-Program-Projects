package Practice_Muiltithread;

class mythr2 extends Thread {
    public void run() {
        int i = 35;
        while (true) {
            System.out.println("welcome Home");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class mythr3 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome Home 2");
        }
    }
}

public class Thread_method {
    public static void main(String[] args) {
        mythr2 t2 = new mythr2();
        mythr3 t3 = new mythr3();
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t3.start();
    }
}
