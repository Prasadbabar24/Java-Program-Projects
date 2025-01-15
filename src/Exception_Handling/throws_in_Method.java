package Exception_Handling;

import java.io.FileReader;
import java.io.IOException;

public class throws_in_Method {
    public static void readfile() throws IOException {
        FileReader file = new FileReader("Prasad.txt");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readfile();   //throws IOException
        } catch (IOException e) {
            System.out.println("file Not Found :" + e.getMessage());
        }
    }
}
