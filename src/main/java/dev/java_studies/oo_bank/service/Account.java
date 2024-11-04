package dev.java_studies.oo_bank.service;

import java.math.BigDecimal;

import dev.java_studies.oo_bank.exception.InvalidOperationException;

public abstract class Account implements IAccount {

    private static final int DEFAULT_AGENCY = 1;

    private static int id = 0;

    private final int agency;

    private final int number;

    private final Client owner;

    private BigDecimal balance = new BigDecimal(0);

    public Account(Client owner) {
        this.number = ++id;
        this.agency = Account.DEFAULT_AGENCY;
        this.owner = owner;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Client getOwner() {
        return owner;
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if(amount.compareTo(balance) > 0) {
            throw new InvalidOperationException("Can't withdraw from account with insufficient balance!");
        }

        balance = balance.subtract(amount);
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void transfer(BigDecimal amount, IAccount receiver) {
        this.withdraw(amount);
        receiver.deposit(amount);
    }

    public String toString() {
        return String.format("{ Owner: %s; Agency: %d; Number: %d; Balance: %.2f }", owner, agency, number, balance);
    }

}