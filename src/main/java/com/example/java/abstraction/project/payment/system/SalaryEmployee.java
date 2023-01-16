package com.example.java.abstraction.project.payment.system;

import java.math.BigDecimal;

public class SalaryEmployee extends Employee {

    public SalaryEmployee(final String name,
                          final Integer bankAccount,
                          final BigDecimal grossWage) {
        super(name, bankAccount, grossWage);
    }

    @Override
    public BigDecimal grossPayment() {
        return grossWage = grossWage.add(doCurrentBonus());
    }

    @Override
    public void giveBonus(Double percentage) {
        currentBonus = currentBonus.add(grossWage.multiply(BigDecimal.valueOf(percentage / 100.0)));
    }

}
