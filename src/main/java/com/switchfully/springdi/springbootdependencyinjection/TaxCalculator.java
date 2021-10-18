package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {
    private final TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(@Qualifier("AmericanTaxCalculation") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxes(double yearlyIncome) {
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}
