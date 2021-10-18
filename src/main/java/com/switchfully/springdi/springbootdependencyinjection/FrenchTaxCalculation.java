package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class FrenchTaxCalculation implements TaxCalculation {
    public static double TAX_RATE = 0.48;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
