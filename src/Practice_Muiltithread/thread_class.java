package Practice_Muiltithread;

class mythr extends Thread {
    public mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 15;
        System.out.println("welcome home");
    }
}

public class thread_class {
    public static void main(String[] args) {
        mythr t1 = new mythr("prasad");
        mythr t2 = new mythr("rohit");
        t1.start();
        System.out.println(t1.getName());
        System.out.println("the id is :" + t1.getId());
        t2.start();
        System.out.println(t2.getName());
        System.out.println("the id is :" + t2.getId());

    }
}
