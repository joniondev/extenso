/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class CentenasTest {

    @Test
    public void testCem() {
        Double valor = (Double) 100.00;
        assertEquals("cem reais", new Extenso(valor).toString());
    }

    @Test
    public void testDuzentos() {
        Double valor = (Double) 200.00;
        assertEquals("duzentos reais", new Extenso(valor).toString());
    }

    @Test
    public void testTrezentos() {
        Double valor = (Double) 300.00;
        assertEquals("trezentos reais", new Extenso(valor).toString());
    }

    @Test
    public void testQuatrocentos() {
        Double valor = (Double) 400.00;
        assertEquals("quatrocentos reais", new Extenso(valor).toString());
    }

    @Test
    public void testQuinhentos() {
        Double valor = (double) 500.00;
        assertEquals("quinhentos reais", new Extenso(valor).toString());
    }

    @Test
    public void testSeiscentos() {
        Double valor = (double) 600.00;
        assertEquals("seiscentos reais", new Extenso(valor).toString());
    }

    @Test
    public void testSetecentos() {
        Double valor = (double) 700.00;
        assertEquals("setecentos reais", new Extenso(valor).toString());
    }

    @Test
    public void testOitocentos() {
        Double valor = (double) 800.00;
        assertEquals("oitocentos reais", new Extenso(valor).toString());
    }

    @Test
    public void testNovecentos() {
        Double valor = (double) 900.00;
        assertEquals("novecentos reais", new Extenso(valor).toString());
    }
}