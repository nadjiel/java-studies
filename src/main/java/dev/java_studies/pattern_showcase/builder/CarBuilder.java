package dev.java_studies.pattern_showcase.builder;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int amount) {
        car.setSeats(amount);
    }

    @Override
    public void setEngine(String engineName) {
        car.setEngine(engineName);
    }

    @Override
    public void setTripComputer(boolean active) {
        car.setTripComputer(active);
    }

    @Override
    public void setGps(boolean active) {
        car.setGps(active);
    }

    public Car getResult() {
        Car result = this.car;

        reset();

        return result;
    }

}
