package src.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("a.txt")){
            System.out.println("read");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//close될 때 나오는 exception
        System.out.println("end");
    }
}
