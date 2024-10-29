package dev.java_studies.flow_control.main;

import dev.java_studies.util.input.InputReader;
import dev.java_studies.flow_control.exception.InvalidParametersException;

import java.util.Scanner;

public class Main {

    public static void contar(int from, int to) throws InvalidParametersException {
        if(from > to) {
            throw new InvalidParametersException("O primeiro número deve ser menor do que o segundo!");
        }

        System.out.println(from);

        if(from < to) {
            contar(from + 1, to);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De qual número você quer começar a contagem ?");
        int start = InputReader.readInteger(scanner);

        System.out.print("Até qual número você quer contar? ");
        int end = InputReader.readInteger(scanner);

        System.out.print("\nCONTAGEM:\n");

        try {
            contar(start, end);
        } catch(InvalidParametersException e) {
            System.out.println("Infelizmente, não é possível contar já que o primeiro número foi maior do que o segundo");
        }

        scanner.close();
    }

}
