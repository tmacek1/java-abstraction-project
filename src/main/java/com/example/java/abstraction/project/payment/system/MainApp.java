package com.example.java.abstraction.project.payment.system;

import com.example.java.abstraction.project.payment.system.internal.CommissionEmployee;
import com.example.java.abstraction.project.payment.system.internal.ContractingCompany;
import com.example.java.abstraction.project.payment.system.internal.PaymentSystem;
import com.example.java.abstraction.project.payment.system.internal.SalaryEmployee;

import java.math.BigDecimal;

public class MainApp {

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();

        // handle employees
        CommissionEmployee jSmith = new CommissionEmployee("John Smith", 12345, new BigDecimal(300));
        SalaryEmployee tFitzgerald = new SalaryEmployee("Tammy Fitzgerald", 22223, new BigDecimal(500));
        paymentSystem.addPayee(jSmith);
        paymentSystem.addPayee(tFitzgerald);
        jSmith.giveCommission(new BigDecimal(50));
        jSmith.giveBonus(5.00);
        tFitzgerald.giveBonus(3.00);

        // handle contracting companies
        ContractingCompany apple = new ContractingCompany("Apple", 55555);
        paymentSystem.addPayee(apple);
        apple.payForServices(new BigDecimal(1250));

        // finalize
        paymentSystem.processPayment();
    }
}
