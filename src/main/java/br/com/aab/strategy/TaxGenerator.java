package br.com.aab.strategy;

public class TaxGenerator {

    Double calcTax(Double value, TaxType taxType) {
        return taxType.taxFactory().calculate(value);
    }
}
