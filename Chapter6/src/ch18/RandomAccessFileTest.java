package src.ch18;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);
        System.out.println("pos: " + rf.getFilePointer());//4
        rf.writeDouble(3.14);
        System.out.println("pos: " + rf.getFilePointer());//12
        rf.writeUTF("안녕하세요");
        System.out.println("pos: " + rf.getFilePointer());//29 = 12 + 17

        rf.seek(0);//맨 앞으로 가줘야함 아래에서 처음부터 읽을 거니까

        int i = rf.readInt();
        double d = rf.readDouble();
        String  str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
