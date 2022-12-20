package ch18;

public class Car {
    public int carNum;
    private static int serial = 10000;

    public Car(){
        serial++;
        this.carNum = serial;
    }

    public int getCarNum(){
        return this.carNum;
    }
}
