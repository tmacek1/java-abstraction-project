package com.example.paymentsystem.internal;

import java.math.BigDecimal;

public class CommissionEmployee extends Employee {

    private static final Double BONUS_MULTIPLIER = 1.5;

    private BigDecimal grossCommission = new BigDecimal(0);

    public CommissionEmployee(final String name,
                              final Integer bankAccount,
                              final BigDecimal grossWage,
                              final BigDecimal allowance) {
        super(name, bankAccount, grossWage, allowance);
    }


    @Override
    public BigDecimal grossPayment() {
        return grossWage.add(doCurrentCommission()).add(doCurrentBonus());
    }

    private BigDecimal doCurrentCommission() {
        BigDecimal commission = grossCommission;
        grossCommission = BigDecimal.valueOf(0);
        return commission;
    }

    public void giveCommission(BigDecimal amount) {
        grossCommission = grossCommission.add(amount);
    }

    @Override
    public void giveBonus(Double percentage) {
        currentBonus = currentBonus.add(
                grossWage.multiply(BigDecimal.valueOf(percentage / 100.0))
                        .multiply(BigDecimal.valueOf(BONUS_MULTIPLIER)));
    }

}
