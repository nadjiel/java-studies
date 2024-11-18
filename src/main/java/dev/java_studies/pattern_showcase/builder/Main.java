package dev.java_studies.pattern_showcase.builder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);

        Manual manual = carManualBuilder.getResult();

        System.out.print("Built car: ");
        System.out.println(car);
        System.out.print("Built manual: ");
        System.out.println(manual);
    }

}
