package ch18;

public class Factory {

    private static Factory instance = new Factory();

    private Factory(){

    }
    public Car createCar(){
        return new Car();
    }

    public static Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }
}
