package dev.java_studies.bank_account.main;

import java.math.BigDecimal;
import java.util.Scanner;

import dev.java_studies.bank_account.input.InputReader;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        BigDecimal saldo;

        System.out.print("Por favor, digite o numero da sua agência: ");
        numero = InputReader.readInteger(scanner);

        System.out.print("Por favor, digite o nome da sua agência: ");
        agencia = InputReader.readString(scanner);

        System.out.print("Por favor, digite o seu nome: ");
        nome = InputReader.readString(scanner);

        System.out.print("Por favor, digite o seu saldo: ");
        saldo = InputReader.readBigDecimal(scanner);

        System.out.printf("""
        Olá %s, obrigado por criar uma conta em nosso banco,\
        sua agência é %s, conta %d e seu saldo %s já está disponível para saque.
        %n""", nome, agencia, numero, saldo);

        scanner.close();
    }

}
