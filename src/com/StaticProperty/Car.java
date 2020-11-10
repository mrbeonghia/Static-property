package com.StaticProperty;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}

class TestStaticProperty{
    public static void main(String[] args) {
        Car car1 = new Car("BMW 740Li","3.0_i6");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mercedes E300","2.0_i4");
        System.out.println(Car.numberOfCars);
    }
}
