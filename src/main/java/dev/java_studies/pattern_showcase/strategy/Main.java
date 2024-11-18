package dev.java_studies.pattern_showcase.strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new AdditionStrategy());

        int n1 = 10;
        int n2 = 5;

        System.out.printf("Addition strategy: %d%n", context.executeStrategy(n1, n2));

        context.setStrategy(new SubtractionStrategy());

        System.out.printf("Subtraction strategy: %d%n", context.executeStrategy(n1, n2));

        context.setStrategy(new MultiplicationStrategy());

        System.out.printf("Multiplication strategy: %d%n", context.executeStrategy(n1, n2));

        context.setStrategy(new DivisionStrategy());

        System.out.printf("Division strategy: %d", context.executeStrategy(n1, n2));
    }

}
