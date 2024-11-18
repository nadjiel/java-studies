package dev.java_studies.pattern_showcase.strategy;

public class DivisionStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a / b;
    }

}
