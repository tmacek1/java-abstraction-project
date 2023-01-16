package com.example.java.abstraction.project.payment.system.internal;

import java.math.BigDecimal;

public abstract class Employee implements Payee {

    private final String name;
    private final Integer bankAccount;
    protected BigDecimal grossWage;
    protected BigDecimal currentBonus;

    public Employee(final String name,
                    final Integer bankAccount,
                    final BigDecimal grossWage) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
        currentBonus = new BigDecimal(0);
    }

    public String name() {
        return name;
    }

    public Integer bankAccount() {
        return bankAccount;
    }

    public abstract void giveBonus(Double percentage);

    protected BigDecimal doCurrentBonus() {
        BigDecimal bonus = currentBonus;
        currentBonus = new BigDecimal(0);
        return bonus;
    }

}

