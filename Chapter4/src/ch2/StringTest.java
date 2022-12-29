package ch2;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java)); //1435804085
        java = java.concat(android);
        System.out.println(System.identityHashCode(java)); //1784662007
    }
}
