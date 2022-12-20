package ch12;

public class Person {

    String name;
    int age;

    public Person(){
        //int num = 10;  이렇게 하면 안된다. 아래가 아직 완료되지 않았기 때문
        this("noname", 1);
        int num1 = 11; //이거는 가능하다.
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Person getPerson(){
        return this;
    }
    public void showPerson(){
        System.out.println(name + "," + age);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        System.out.println(person);

        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
