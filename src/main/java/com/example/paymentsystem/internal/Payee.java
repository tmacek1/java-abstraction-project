package com.example.paymentsystem.internal;

import java.math.BigDecimal;

public interface Payee {

    String name();

    BigDecimal grossPayment();

    Integer bankAccount();

}
