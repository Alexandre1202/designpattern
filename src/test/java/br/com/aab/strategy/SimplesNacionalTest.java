package br.com.aab.strategy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SimplesNacionalTest {

    private SimplesNacional simplesNacional = new SimplesNacional();

    @Test
    public void testPrimeiraFaixa() {
        Double result = simplesNacional.calculate(179999D);
        Double expected = 7199.96D;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSegundaFaixa() {
        Double result = simplesNacional.calculate(359999D);
        Double expected = 26279.927D;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testTerceiraFaixa() {
        Double result = simplesNacional.calculate(719999D);
        Double expected = 68399.905D;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testQuartaFaixa() {
        Double result = simplesNacional.calculate(1799999D);
        Double expected = 192599.89299999998D;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testQuintaFaixa() {
        Double result = simplesNacional.calculate(3599999D);
        Double expected = 514799.85699999996D;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSextaFaixa() {
        Double result = simplesNacional.calculate(4799999D);
        Double expected = 911999.81D;
        Assertions.assertThat(result).isEqualTo(expected);
    }

}