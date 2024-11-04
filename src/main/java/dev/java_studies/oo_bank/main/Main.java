package dev.java_studies.oo_bank.main;

import dev.java_studies.oo_bank.service.Account;
import dev.java_studies.oo_bank.service.CheckingAccount;
import dev.java_studies.oo_bank.service.Client;
import dev.java_studies.oo_bank.service.SavingsAccount;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Client nadjiel = new Client("Nadjiel");

        Account checkingAccount = new CheckingAccount(nadjiel);
        Account savingsAccount = new SavingsAccount(nadjiel);

        checkingAccount.deposit(new BigDecimal(1990));
        checkingAccount.transfer(new BigDecimal(100), savingsAccount);

        checkingAccount.printExtract();
        savingsAccount.printExtract();
    }

}
