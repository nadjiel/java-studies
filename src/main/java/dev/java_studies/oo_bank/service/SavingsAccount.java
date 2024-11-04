package dev.java_studies.oo_bank.service;

public class SavingsAccount extends Account{

    public SavingsAccount(Client owner) {
        super(owner);
    }

    @Override
    public void printExtract() {
        System.out.printf("Savings Account of %s%n", getOwner());
        System.out.println(this);
    }

}
