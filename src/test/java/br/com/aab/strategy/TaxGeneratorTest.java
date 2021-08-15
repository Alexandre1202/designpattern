package br.com.aab.strategy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TaxGeneratorTest {

    private TaxGenerator taxGenerator = new TaxGenerator();

    @Test
    public void testTaxGenerator() {
        Double result = taxGenerator.calcTax(1000D, TaxType.ISS);
        Double expected = 20D;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}