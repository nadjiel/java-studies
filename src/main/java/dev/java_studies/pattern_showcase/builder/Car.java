package dev.java_studies.pattern_showcase.builder;

public class Car {

    private int seats;

    private String engine;

    private boolean tripComputer;

    private boolean Gps;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return Gps;
    }

    public void setGps(boolean gps) {
        Gps = gps;
    }

    @Override
    public String toString() {
        return "{ seats:%d; engine: \"%s\"; tripComputer:%b; gps:%b }".formatted(
                this.seats,
                this.engine,
                this.tripComputer,
                this.Gps
        );
    }

}
