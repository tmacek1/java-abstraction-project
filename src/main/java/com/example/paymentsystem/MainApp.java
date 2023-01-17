package com.example.paymentsystem;

import com.example.paymentsystem.internal.CommissionEmployee;
import com.example.paymentsystem.internal.ContractingCompany;
import com.example.paymentsystem.internal.PaymentSystem;
import com.example.paymentsystem.internal.SalaryEmployee;

import java.math.BigDecimal;

public class MainApp {

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();

        // handle employees
        CommissionEmployee jSmith = new CommissionEmployee("John Smith", 12345, new BigDecimal(300), new BigDecimal(100));
        SalaryEmployee tFitzgerald = new SalaryEmployee("Tammy Fitzgerald", 22223, new BigDecimal(500), new BigDecimal(25));
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
