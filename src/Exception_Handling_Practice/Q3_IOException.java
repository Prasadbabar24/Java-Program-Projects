package Exception_Handling_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Q3_IOException {
    public static void main(String[] args) {
        try {
            File file = new File("non existing file.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Caught IOException :" + e.getMessage());
        } finally {
            System.out.println("Finally block Executed");
        }
    }
}
