package com.example.paymentsystem.internal;

import java.math.BigDecimal;

public interface TaxablePayee extends Payee {

    public BigDecimal allowance();
}
