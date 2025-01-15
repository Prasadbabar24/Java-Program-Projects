import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_Handling {
    public static void main(String[] args) {
        // create a file
       /* File myfile = new File("file Handling.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create new file");
            e.printStackTrace();
        }

        */
        // write a file
        try {
            FileWriter fileWriter = new FileWriter("file Handling.txt");
            fileWriter.write("this is frist file to create and write using java \n okay thank you");
            fileWriter.write("this is the another line");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
