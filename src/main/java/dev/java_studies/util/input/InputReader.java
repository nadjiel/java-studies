package dev.java_studies.util.input;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;

public class InputReader {

    public static String validateInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return "Numero inválido, por favor digite um número inteiro.";
        }

        return "";
    }

    public static String validateBigDecimal(String s) {
        try {
            new BigDecimal(s);
        } catch(NumberFormatException e) {
            return "Numero inválido, por favor digite um valor monetário válido.";
        }

        return "";
    }

    public static String readAndValidate(Scanner scanner, Function<String, String> validator) {
        String result = scanner.nextLine();

        String errorMessage = validator.apply(result);

        if(!errorMessage.isEmpty()) {
            System.out.println(errorMessage);

            result = readAndValidate(scanner, validator);
        }

        return result;
    }

    public static int readInteger(Scanner scanner) {
        return Integer.parseInt(readAndValidate(scanner, InputReader::validateInteger));
    }

    public static String readString(Scanner scanner) {
        return scanner.nextLine();
    }

    public static BigDecimal readBigDecimal(Scanner scanner) {
        return new BigDecimal(readAndValidate(scanner, InputReader::validateBigDecimal));
    }

}
