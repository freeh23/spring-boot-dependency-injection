package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.stereotype.Component;


public interface TaxCalculation {

    double calculateTaxes(double yearlyIncome);
}
