package com.example.paymentsystem.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {

    private final List<Payee> payees;

    public PaymentSystem() {
        this.payees = new ArrayList<>();
    }

    public void addPayee(Payee payee) {
        if (!payees.contains(payee)) {
            payees.add(payee);
        }
    }

    public void processPayment() {
        for (Payee payee : payees) {
            BigDecimal grossPayment = payee.grossPayment();
            BigDecimal tax = new BigDecimal(0);
            if (payee instanceof TaxablePayee) {
                BigDecimal taxableIncome = grossPayment.subtract(((TaxablePayee) payee).allowance());
                double taxRate = 0.2;
                tax = taxableIncome.multiply(BigDecimal.valueOf(taxRate));
            }

            BigDecimal netPay = grossPayment.subtract(tax);
            System.out.println("Paying to: " + payee.name());
            System.out.println("Gross: " + grossPayment);
            System.out.println("Tax-" + tax);
            System.out.println("Netto: " + netPay);
            System.out.println("Funds transferred to: " + payee.bankAccount());
        }
    }


}
