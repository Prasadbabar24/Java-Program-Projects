package Multithreadind_Practice;

class numthread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
    }
}
class letterthread extends Thread{
    @Override
    public void run() {
        for (char c='A';c<='J';c++){
            System.out.println(c);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        numthread num=new numthread();
        letterthread letter=new letterthread();
        num.start();
        letter.start();
    }
}
