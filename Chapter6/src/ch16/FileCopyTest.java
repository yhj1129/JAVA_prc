package src.ch16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {
    public static void main(String[] args){
        long millisecond = 0;

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {

            millisecond = System.currentTimeMillis();//수행한 시간 계산
            int i;
            while ((i = bis.read()) != -1){ //a.zip을 읽어서
                bos.write(i); // copy.zip에 write
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 소요되었습니다");

//        Socket socket = new Socket();
//
//        socket.getInputStream();//영어로만 해야함
//        new InputStreamReader(socket.getInputStream()); // 한국말 가능
//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        // 버퍼링까지
//        br.read();
//        br.readLine(); //한 줄을 다 읽는 것
    }
}
//374 버퍼 전
//4 버퍼 후