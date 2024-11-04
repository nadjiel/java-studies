package dev.java_studies.oo_bank.service;

import java.math.BigDecimal;

public interface IAccount {

    void withdraw(BigDecimal amount);

    void deposit(BigDecimal amount);

    void transfer(BigDecimal amount, IAccount receiver);

    void printExtract();

}
