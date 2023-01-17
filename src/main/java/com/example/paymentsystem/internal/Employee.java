package com.example.paymentsystem.internal;

import java.math.BigDecimal;

public abstract class Employee implements TaxablePayee {

    private final String name;
    private final Integer bankAccount;
    private final BigDecimal allowance;
    protected BigDecimal grossWage;
    protected BigDecimal currentBonus;

    public Employee(final String name,
                    final Integer bankAccount,
                    final BigDecimal grossWage,
                    final BigDecimal allowance) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
        this.allowance = allowance;
        currentBonus = new BigDecimal(0);
    }

    public BigDecimal allowance() {
        return allowance;
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

