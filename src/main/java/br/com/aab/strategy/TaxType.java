package br.com.aab.strategy;

public enum TaxType {
    ISS {
        @Override
        public Tax taxFactory() {
            return new ISS();
        }
    },
    SIMPLESNACIONAL {
        @Override
        public Tax taxFactory() {
            return new SimplesNacional();
        }
    };

    public abstract Tax taxFactory();
}
