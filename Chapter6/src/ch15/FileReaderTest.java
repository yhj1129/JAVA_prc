package src.ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fis = new FileReader("reader.txt")) {
            int i;
            while ((i = fis.read())!= -1) { //파일의 끝까지 읽기
                System.out.print((char) i);
            }

        } catch (IOException e) {

        }

    }
}
