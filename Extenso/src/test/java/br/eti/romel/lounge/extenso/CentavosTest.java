/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class CentavosTest {

    @Test
    public void testUm() {
        Double valor = (Double) 0.01;
        assertEquals("um centavo", new Extenso(valor).toString());
    }

    @Test
    public void testCinco() {
        Double valor = (Double) 0.05;
        assertEquals("cinco centavos", new Extenso(valor).toString());
    }

    @Test
    public void testOnze() {
        Double valor = (Double) 0.11;
        assertEquals("onze centavos", new Extenso(valor).toString());
    }

    @Test
    public void testNoventaENove() {
        Double valor = (Double) 0.99;
        assertEquals("noventa e nove centavos", new Extenso(valor).toString());
    }
}