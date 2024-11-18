package dev.java_studies.pattern_showcase.builder;

public class CarManualBuilder implements Builder {

    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int amount) {
        manual.setSeats(amount);
    }

    @Override
    public void setEngine(String engineName) {
        manual.setEngine(engineName);
    }

    @Override
    public void setTripComputer(boolean active) {
        manual.setTripComputer(active);
    }

    @Override
    public void setGps(boolean active) {
        manual.setGps(active);
    }

    public Manual getResult() {
        Manual result = this.manual;

        reset();

        return result;
    }

}
