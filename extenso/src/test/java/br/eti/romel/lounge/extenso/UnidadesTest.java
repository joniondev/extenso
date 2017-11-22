/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class UnidadesTest {

    @Test
    public void testUm() {
        Double valor = (Double) 1.00;
        assertEquals("um real", new Extenso(valor).toString());
    }

    @Test
    public void testDois() {
        Double valor = (Double) 2.00;
        assertEquals("dois reais", new Extenso(valor).toString());
    }

    @Test
    public void testTres() {
        Double valor = (Double) 3.00;
        assertEquals("três reais", new Extenso(valor).toString());
    }

    @Test
    public void testQuatro() {
        Double valor = (Double) 4.00;
        assertEquals("quatro reais", new Extenso(valor).toString());
    }

    @Test
    public void testCinco() {
        Double valor = (Double) 5.00;
        assertEquals("cinco reais", new Extenso(valor).toString());
    }

    @Test
    public void testSeis() {
        Double valor = (Double) 6.00;
        assertEquals("seis reais", new Extenso(valor).toString());
    }

    @Test
    public void testSete() {
        Double valor = (Double) 7.00;
        assertEquals("sete reais", new Extenso(valor).toString());
    }

    @Test
    public void testOito() {
        Double valor = (Double) 8.00;
        assertEquals("oito reais", new Extenso(valor).toString());
    }

    @Test
    public void testNove() {
        Double valor = (Double) 9.00;
        assertEquals("nove reais", new Extenso(valor).toString());
    }
}