//package ch4;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//public class ClassTest {
//    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Class c1 = Class.forName("ch4.Person");
//
//        Person person = (Person)c1.newInstance();
//        person.setName("Lee");
//        System.out.println(person);
//
//        Class c2 = person.getClass(); //이미 인스턴스가 있어야 사용 가능
//        Person p = (Person)c2.newInstance();
//        System.out.println(p);
//
//        Class[] parameterTypes = {String.class};
//        Constructor cons = c2.getConstructor(parameterTypes);
//
//        Object[] initargs = {"Kim"};
//        Person kimPerson = (Person)cons.newInstance(initargs);
//        System.out.println(kimPerson);
//    }
//}
