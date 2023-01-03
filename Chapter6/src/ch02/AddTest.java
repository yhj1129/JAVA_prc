package src.ch02;

public class AddTest {
    public static void main(String[] args) {
        Add add = (x, y) -> {return x+y;}; // 인터페이스를 구현한 것
        // 실행문이 한 줄인 경우 중괄호 생략 가능
        // Add add = (x, y) -> return x+y; //return이면 생략 불가
        //Add add = (x, y) -> x+y; return까지 생략하면 가능
        System.out.println(add.add(2, 3));
    }
}
