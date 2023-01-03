package src.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);//e 발생
        Class c = Class.forName(className);// e 발생
        return c;
    }
    public static void main(String[] args) {
        //호출하는 쪽에서 해결
        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("end");
    }
}
