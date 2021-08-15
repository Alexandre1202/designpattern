package br.com.aab.strategy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ISSTest {

    private Tax fixture = new ISS();

    @Test
    public void testISS() {
        Double result = fixture.calculate(100D);
        Double expected = 2D;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}