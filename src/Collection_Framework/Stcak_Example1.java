package Collection_Framework;

import java.util.Stack;

public class Stcak_Example1 {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        // Adding books
        books.push("The Language of SQL ");
        books.push("Core java & advance java");
        books.push("Data Structures & Algorithms");
        //Current Book
        System.out.println("Currently Reading : " +
                books.peek());
        //Finished reading one book
        System.out.println("Finished Reading : " +
                books.pop());
        //Displaying remaining books
        System.out.println("Books in Stack : " + books);
    }
}
