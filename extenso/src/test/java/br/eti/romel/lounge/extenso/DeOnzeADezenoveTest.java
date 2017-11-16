/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class DeOnzeADezenoveTest {

    @Test
    public void testOnze() {
        Double valor = (Double) 11.00;
        assertEquals("onze reais", new Extenso(valor).toString());
    }

    @Test
    public void testDoze() {
        Double valor = (Double) 12.00;
        assertEquals("doze reais", new Extenso(valor).toString());
    }

    @Test
    public void testTreze() {
        Double valor = (Double) 13.00;
        assertEquals("treze reais", new Extenso(valor).toString());
    }

    @Test
    public void testQuatorze() {
        Double valor = (Double) 14.00;
        assertEquals("quatorze reais", new Extenso(valor).toString());
    }

    @Test
    public void testQuinze() {
        Double valor = (Double) 15.00;
        assertEquals("quinze reais", new Extenso(valor).toString());
    }

    @Test
    public void testDezesseis() {
        Double valor = (Double) 16.00;
        assertEquals("dezesseis reais", new Extenso(valor).toString());
    }

    @Test
    public void testDezessete() {
        Double valor = (Double) 17.00;
        assertEquals("dezessete reais", new Extenso(valor).toString());
    }

    @Test
    public void testDezoito() {
        Double valor = (Double) 18.00;
        assertEquals("dezoito reais", new Extenso(valor).toString());
    }

    @Test
    public void testDezenove() {
        Double valor = (Double) 19.00;
        assertEquals("dezenove reais", new Extenso(valor).toString());
    }
}