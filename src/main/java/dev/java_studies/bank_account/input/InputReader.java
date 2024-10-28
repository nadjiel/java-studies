package dev.java_studies.bank_account.input;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReader {

    public static int readInt(Scanner scanner, String errorMessage) {
        int result;

        try {
            result = scanner.nextInt();

            scanner.nextLine();
        } catch(InputMismatchException e) {
            scanner.nextLine();

            System.out.println(errorMessage);

            result = readInt(scanner, errorMessage);
        }

        return result;
    }

    public static String readString(Scanner scanner, String errorMessage) {
        String result;

        try {
            result = scanner.nextLine();
        } catch(NoSuchElementException e) {
            System.out.println(errorMessage);

            result = readString(scanner, errorMessage);
        }

        return result;
    }

    public static BigDecimal readBigDecimal(Scanner scanner, String errorMessage) {
        BigDecimal result;

        try {
            result = scanner.nextBigDecimal();
        } catch(InputMismatchException e) {
            scanner.nextLine();

            System.out.println(errorMessage);

            result = readBigDecimal(scanner, errorMessage);
        }

        return result;
    }

}
