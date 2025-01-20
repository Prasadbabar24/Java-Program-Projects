package Multithreadind_Practice;

public class Counter {
    private int Count=0;

    public synchronized void increment(){
        Count++;
    }

    public int getCount() {
        return Count;
    }


}
