/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class NumerosInteirosTest {

    @Test
    public void testUm() {
        Double valor = (double) 1.00;
        assertEquals("um real", new Extenso(valor).toString());
    }

    @Test
    public void testMil() {
        Double valor = (double) 1000.00;
        assertEquals("mil reais", new Extenso(valor).toString());
    }

    @Test
    public void testMilhao() {
        Double valor = (double) 1000000.00;
        assertEquals("um milhão de reais", new Extenso(valor).toString());
    }

    @Test
    public void testBilhao() {
        Double valor = (double) 1000000000.00;
        assertEquals("um bilhão de reais", new Extenso(valor).toString());
    }

    @Test
    public void testTrilhao() {
        Double valor = (double) 1000000000000.00;
        assertEquals("um trilhão de reais", new Extenso(valor).toString());
    }
}