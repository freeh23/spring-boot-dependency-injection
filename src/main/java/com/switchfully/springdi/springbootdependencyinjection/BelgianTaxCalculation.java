package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BelgianTaxCalculation implements TaxCalculation {
    public static double TAX_RATE = 0.45;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
