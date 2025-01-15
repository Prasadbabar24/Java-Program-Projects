package Collection_Framework;

import java.util.PriorityQueue;

public class PriorityQueue_Example1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Adding Elements
        pq.add(40);
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Priority Queue : " + pq);

        //Accessing an element
        System.out.println("Peek (Highest Priority) : " + pq.peek());

        //Removing an element
        System.out.println("Poll : " + pq.poll());
        System.out.println("Priority Queue : " + pq);

    }
}
