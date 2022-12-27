package ch15;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer sell");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }
    //중복되는 메서드, buy 거를 쓸건지 sell거를 쓸건지 정해야함. 또는 재정의
    @Override
    public void sell() {
        System.out.println("customer buy");
    }

    public void hello(){
        System.out.println("hello");
    }
}
