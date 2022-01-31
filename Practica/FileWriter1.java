package aniruddha_code;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("F:\\anudip\\Reader.txt");
            writer.write("Writing Test data");
            writer.flush();
            System.out.println("Data written to File");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ioe) {

            }
        }
    }

}
