package br.com.minerva.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyTest {

    @Test
    public void deveLancarExcecaoQuandoValorMonetarioForZero(){
        assertThrows(IllegalArgumentException.class, () -> new Money(0));
    }

    @Test
    public void deveLancarExcecaoQuandoValorMonetarioForNegativo(){
        assertThrows(IllegalArgumentException.class, () -> new Money(-10));
    }
}
