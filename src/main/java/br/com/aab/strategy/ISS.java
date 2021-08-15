package br.com.aab.strategy;

public class ISS implements Tax {
    @Override
    public Double calculate(Double value) {
        return value * 0.02;
    }
}
