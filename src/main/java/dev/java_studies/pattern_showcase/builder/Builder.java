package dev.java_studies.pattern_showcase.builder;

public interface Builder {

    void reset();

    void setSeats(int amount);

    void setEngine(String engineName);

    void setTripComputer(boolean active);

    void setGps(boolean active);

}
