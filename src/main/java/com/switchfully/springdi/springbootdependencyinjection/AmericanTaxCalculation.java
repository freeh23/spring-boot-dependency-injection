package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("AmericanTaxCalculation")
public class AmericanTaxCalculation implements TaxCalculation {
    public static double TAX_RATE = 0.18;
    public static int LUMP_SUM = 950;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * TAX_RATE + LUMP_SUM;
    }
}