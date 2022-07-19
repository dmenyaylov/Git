package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = Car.createCar();
        Car car2 = Car.createCar();
        Car car3 = Car.createCar();
        Car car4 = Car.start();
        Car car5 = Car.start();
        Car car6 = Car.start();
        System.out.println(car3.i);

    }

}
class  Car {

    public static int i = 0;
    static Car car= new Car();
    private Car (){}
    public static Car createCar (){
        return car;
    }
    public static Car start(){
        i++;
        return createCar();
    }
}