package src.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char)fis.read());//한 바이트씩 읽고 문자로 변환해 반환
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
        } catch (IOException e) { //에러가 발생하면 캐치, 파일이 없는 경우
            e.printStackTrace();
        }finally { //클로징을 해주기 위해 finally
            try {
                fis.close(); //파일이 null일 경우 closing 못하니까
            } catch (IOException e) { // catch
                e.printStackTrace();
            }catch (Exception e2){
                System.out.println(e2);
            }
        }
        System.out.println("end");
    }
}
