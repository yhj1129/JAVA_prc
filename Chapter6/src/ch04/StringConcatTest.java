package src.ch04;

public class StringConcatTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1, s2);

        //람다식
        StringConcat concat = (s, v) -> System.out.println(s + ", " + v); //클래스 만드는 부분이 생략되고 람다식으로 구현
        concat.makeString(s1, s2);

        StringConcat concat2 = new StringConcat(){//아예 생략되는 것이 아니라 내부에서 익명 클래스로 만들어 진다
            @Override
            public void makeString(String s1, String s2){
                System.out.println(s1 + ", " + s2);
            }
        };

        concat2.makeString(s1, s2);
    }
}
