package com.example.java.abstraction.project.payment.system;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {

    private List<Payee> payees;

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
            System.out.println("Paying to: " + payee.name());
            System.out.println("Gross: " + grossPayment);
            System.out.println("Funds transferred to: " + payee.bankAccount());
        }
    }



}
