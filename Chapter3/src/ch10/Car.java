package ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void startCar(){
        System.out.println("시동을 켭니다");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다");
    }

    public void washCar(){} //구현을 하지 않았지만 추상 메서드 아니다. 필요한 경우 하위 클래스에서 재정의하여 사용하는 메서드
    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    } // 정해진 시나리오
}
