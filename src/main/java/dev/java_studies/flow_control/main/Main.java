package dev.java_studies.flow_control.main;

import dev.java_studies.util.input.InputReader;
import dev.java_studies.flow_control.exception.InvalidParametersException;

import java.util.Scanner;

public class Main {

    public static void count(int times) {
        for(int i = 1; i <= times; i++) {
            System.out.println(i);
        }
    }

    public static void count(int from, int to) throws InvalidParametersException {
        if(from > to) {
            throw new InvalidParametersException("O primeiro número deve ser menor do que o segundo!");
        }

        count(to + 1 - from);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De qual número você quer começar a contagem? ");
        int start = InputReader.readInteger(scanner);

        System.out.print("Até qual número você quer contar? ");
        int end = InputReader.readInteger(scanner);

        System.out.print("\nCONTAGEM:\n");

        try {
            count(start, end);
        } catch(InvalidParametersException e) {
            System.out.println("Não é possível contar já que o primeiro número é maior do que o segundo");
        }

        scanner.close();
    }

}
