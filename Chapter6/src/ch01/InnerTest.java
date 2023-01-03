package src.ch01;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    } //out클래스를 만들 때 in클래스도 만들어준다
    //out 클래스가 생기고 in 클래스가 생기기 때문에 in 클래스에 static 은 불가하다
    class InClass{
        int iNum = 100;
        int sInNum = 500;
        void inTest(){
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");

        }
    }

    public void usingClass(){
        inClass.inTest();
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("InClass num = " +iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }

        static void sTest(){
//            System.out.println("InClass num = " +iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();//inner 클래스의 메서드가 사용된다

        OutClass.InClass inner = outClass.new InClass(); //내부 클래스를 생성하려면(private이 아닌 경우)
        inner.inTest();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        System.out.println();

        OutClass.InStaticClass.sTest();
    }
}
