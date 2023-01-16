package com.example.java.abstraction.project.payment.system.internal;

import java.math.BigDecimal;

public class ContractingCompany implements Payee {

    private final String name;
    private final Integer bankAccount;
    private BigDecimal currentBalance;

    public ContractingCompany(String name, Integer bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
        currentBalance = new BigDecimal(0);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Integer bankAccount() {
        return bankAccount;
    }

    @Override
    public BigDecimal grossPayment() {
        return doPayment();
    }

    private BigDecimal doPayment() {
        BigDecimal balance = currentBalance;
        currentBalance = new BigDecimal(0);
        return balance;
    }

    public void payForServices(BigDecimal amount) {
        currentBalance = currentBalance.add(amount);
    }
}
