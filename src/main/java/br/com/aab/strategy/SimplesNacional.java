package br.com.aab.strategy;

public class SimplesNacional implements Tax{
    @Override
    public Double calculate(Double value) {
        return value <= 180000 ? value * 0.04 :
                value <= 360000 ? value * 0.073 :
                value <= 720000 ? value * 0.095 :
                value <= 1800000 ? value * 0.107 :
                value <= 3600000 ? value * 0.143 :
                value <= 4800000 ? value * 0.19 :
                value * 0.25;
    }
}
