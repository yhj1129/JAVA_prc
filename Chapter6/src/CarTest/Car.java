package src.CarTest;

public class Car {
    private static int serialNum = 10000;
    public int carNum;

    Car(){
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum(){
        return this.carNum;
    }
}
