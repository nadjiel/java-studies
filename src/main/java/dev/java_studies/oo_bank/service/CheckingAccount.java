package dev.java_studies.oo_bank.service;

public class CheckingAccount extends Account{

    public CheckingAccount(Client owner) {
        super(owner);
    }

    @Override
    public void printExtract() {
        System.out.printf("Checking Account of %s%n", getOwner());
        System.out.println(this);
    }

}
