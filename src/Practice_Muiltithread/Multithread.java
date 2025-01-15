package Practice_Muiltithread;

class mythread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("thread 1 is cooking");
            System.out.println("i am happy");
            i++;
        }
    }
}

class mythread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("thread 2 is chatting her");
            System.out.println("i am sad");
            i++;
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        mythread1 th1 = new mythread1();
        mythread2 th2 = new mythread2();
        th1.start();
        th2.start();
    }
}
