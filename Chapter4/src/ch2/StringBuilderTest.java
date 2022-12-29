package ch2;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));//1435804085
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));//1435804085 해시값이 동일하다

        String test = buffer.toString();
        System.out.println(test);
    }
}
