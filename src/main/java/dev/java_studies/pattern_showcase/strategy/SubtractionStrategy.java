package dev.java_studies.pattern_showcase.strategy;

public class SubtractionStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }

}
