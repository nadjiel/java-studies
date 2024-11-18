package dev.java_studies.pattern_showcase.strategy;

public class AdditionStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

}
