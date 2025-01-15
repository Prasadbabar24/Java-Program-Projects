package Collection_Framework;

import java.util.LinkedList;

public class LinkedList_Example1 {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        //Adding Elements/tasks
        tasks.add("read");
        tasks.add("write");
        tasks.add("delete");
        tasks.add("insert");
        System.out.println("LinkedList is :" + tasks);

        //adding first and last element
        tasks.addFirst("Remove");
        tasks.addLast("Removeall");
        System.out.println("After Adding First & Last Element :" + tasks);

        //Accessing elements at first
        System.out.println("First task is " + tasks.getFirst());


        //iterating all elements
        for (String Task : tasks) {
            System.out.println(Task);
        }
        // Removing Elements
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("After Removal : " + tasks);

    }
}
