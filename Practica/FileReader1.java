package aniruddha_code;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReader1 {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("F:\\anudip\\Reader.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}
