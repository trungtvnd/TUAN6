package BUOI29.thuchanh.Car;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar = 0;
    Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
}
