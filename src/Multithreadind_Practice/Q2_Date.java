package Multithreadind_Practice;

import java.util.Date;

class datethraed extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Q2_Date {
    public static void main(String[] args) {
        datethraed dt = new datethraed();
        dt.start();
    }
}
