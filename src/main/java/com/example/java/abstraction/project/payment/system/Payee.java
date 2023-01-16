package com.example.java.abstraction.project.payment.system;

import java.math.BigDecimal;

public interface Payee {

    String name();

    BigDecimal grossPayment();

    Integer bankAccount();

}
