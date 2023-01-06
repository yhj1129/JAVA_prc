package src.ch17;

import java.io.*;

class Person implements Externalizable{
    String name;
    transient String job;

    public Person(){}

    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        job = in.readUTF();
    }
}
public class SerializationTest {

    public static void main(String[] args) {

        Person personLee = new Person("이순신" ,"대표이사");
        Person personYoo = new Person("유현주" ,"회장");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);
            oos.writeObject(personYoo);

        } catch (IOException ex) {
            System.out.println(ex);
        }

        try(FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person pLee = (Person) ois.readObject();//반환이 되는 값은 위에서 정의한 Person으로 반환됨
            Person pYoo = (Person) ois.readObject();

            System.out.println(pLee);//toString으로 만들어두었음
            System.out.println(pYoo);
        } catch (IOException ex) {
            System.out.println(ex);

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
