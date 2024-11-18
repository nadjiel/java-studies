package dev.java_studies.pattern_showcase.builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sports Engine");
        builder.setTripComputer(true);
        builder.setGps(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(7);
        builder.setEngine("V8 Engine");
        builder.setTripComputer(true);
        builder.setGps(true);
    }

}
