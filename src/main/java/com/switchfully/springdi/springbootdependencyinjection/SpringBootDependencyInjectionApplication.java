package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication implements CommandLineRunner {

    private final TaxCalculator taxCalculator;

    @Autowired
    public SpringBootDependencyInjectionApplication(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
        /*
        Without Spring Boot:
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBootDependencyInjectionApplication.class);
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);

        System.out.println(taxCalculator.calculateTaxes(23000));*/
    }

    @Override
    public void run(String... args) {
        System.out.println(taxCalculator.calculateTaxes(23000));
    }
}
