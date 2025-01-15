package TEST;

public class numbers extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
