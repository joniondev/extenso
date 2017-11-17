/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class DezenasTest {

    @Test
    public void testDez() {
        Double valor = (Double) 10.00;
        assertEquals("dez reais", new Extenso(valor).toString());
    }

    @Test
    public void testVinte() {
        Double valor = (Double) 20.00;
        assertEquals("vinte reais", new Extenso(valor).toString());
    }

    @Test
    public void testTrinta() {
        Double valor = (Double) 30.00;
        assertEquals("trinta reais", new Extenso(valor).toString());
    }

    @Test
    public void testQuarenta() {
        Double valor = (Double) 40.00;
        assertEquals("quarenta reais", new Extenso(valor).toString());
    }

    @Test
    public void testCinquenta() {
        Double valor = (Double) 50.00;
        assertEquals("cinquenta reais", new Extenso(valor).toString());
    }

    @Test
    public void testSessenta() {
        Double valor = (Double) 60.00;
        assertEquals("sessenta reais", new Extenso(valor).toString());
    }

    @Test
    public void testSetenta() {
        Double valor = (Double) 70.00;
        assertEquals("setenta reais", new Extenso(valor).toString());
    }

    @Test
    public void testOitenta() {
        Double valor = (Double) 80.00;
        assertEquals("oitenta reais", new Extenso(valor).toString());
    }

    @Test
    public void testNoventa() {
        Double valor = (Double) 90.00;
        assertEquals("noventa reais", new Extenso(valor).toString());
    }
}