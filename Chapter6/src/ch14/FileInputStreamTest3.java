package src.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args) {
        int i;
        try(FileInputStream fis = new FileInputStream("input2.txt")){ //오토 클로징

            byte[] bs = new byte[10];

            while ((i = fis.read(bs, 1, 9)) != -1){ //배열의 끝이면 -1이니까 배열의 끝까지
                for (int j = 0 ; j < i ; j++){ //i는 fis를 읽어온 배열의 길이이니까
                                                // 10개를 읽었으면 10개 출력하고 6개를 읽었으면 6개 출력
                    System.out.print((char)bs[j]);
                }//읽은 배열 출력
                System.out.println(" : " + i + "바이트 읽음");
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
