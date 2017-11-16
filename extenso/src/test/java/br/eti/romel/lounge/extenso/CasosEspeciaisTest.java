/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class CasosEspeciaisTest {

    @Test
    public void testUmEUm() {
        final Double valor = (Double) 1.01;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "um real e um centavo";
        
        assertEquals(esperado, extenso);
    }

    @Test
    public void testCincoENoventaEQuinze() {
        final Double valor = (Double) 5.15;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "cinco reais e quinze centavos";
        
        assertEquals(esperado, extenso);
    }

    @Test
    public void testDoisENoventaENove() {
        final Double valor = (Double) 2.99;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "dois reais e noventa e nove centavos";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testUmDoisTresQuatroCincoSeis() {
        final Double valor = (double) 123456789012345.67;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "cento e vinte e três trilhões, " +
                                "quatrocentos e cinquenta e seis bilhões, " +
                                "setecentos e oitenta e nove milhões, " +
                                "doze mil, " +
                                "trezentos e quarenta e cinco reais e " +
                                "sessenta e sete centavos";

        assertEquals(esperado, extenso);
    }

    @Test
    /*
     * NOTA: Tecnicamente, um Double.MAX_VALUE é maior que o número abaixo
     * representado, mas serve como referência para a maior grandeza prevista
     * na classe Extenso.
     */
    public void testMaximo() {
        final BigDecimal valor = new BigDecimal("999999999999999999999999999999999999999999999999999999999999999999.99");
        final String extenso = new Extenso(valor).toString();
        final String esperado = "novecentos e noventa e nove vigesilhões, " +
                                "novecentos e noventa e nove novedecilhões, " +
                                "novecentos e noventa e nove octodecilhões, " +
                                "novecentos e noventa e nove setedecilhões, " +
                                "novecentos e noventa e nove sexdecilhões, " +
                                "novecentos e noventa e nove quindecilhões, " +
                                "novecentos e noventa e nove quatordecilhões, " +
                                "novecentos e noventa e nove tredecilhões, " +
                                "novecentos e noventa e nove duodecilhões, " +
                                "novecentos e noventa e nove undecilhões, " +
                                "novecentos e noventa e nove decilhões, " +
                                "novecentos e noventa e nove nonilhões, " +
                                "novecentos e noventa e nove octilhões, " +
                                "novecentos e noventa e nove septilhões, " +
                                "novecentos e noventa e nove sextilhões, " +
                                "novecentos e noventa e nove quintilhões, " +
                                "novecentos e noventa e nove quatrilhões, " +
                                "novecentos e noventa e nove trilhões, " +
                                "novecentos e noventa e nove bilhões, " +
                                "novecentos e noventa e nove milhões, " +
                                "novecentos e noventa e nove mil, " +
                                "novecentos e noventa e nove reais e " +
                                "noventa e nove centavos";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testUmMilhaoEUm() {
        final Double valor = (double) 1000000.01;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "um milhão de reais e um centavo";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testOnzeMilhoesEOnze() {
        final Double valor = (double) 11000000.11;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "onze milhões de reais e onze centavos";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testNerdNumber() {
        final Double valor = (double) 10101010101010.10;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "dez trilhões, " +
                                "cento e um bilhões, " +
                                "dez milhões, " +
                                "cento e um mil, " +
                                "dez reais e " +
                                "dez centavos";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testNerdPrimer() {
        final Double valor = (double) 11111111111111.11;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "onze trilhões, " +
                                "cento e onze bilhões, " +
                                "cento e onze milhões, " +
                                "cento e onze mil, " +
                                "cento e onze reais e " +
                                "onze centavos";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testOnePrimer() {
        final BigDecimal valor = new BigDecimal("1001001001001001.01");
        final String extenso = new Extenso(valor).toString();
        final String esperado = "um quatrilhão, " +
                                "um trilhão, " +
                                "um bilhão, " +
                                "um milhão, " +
                                "um mil, " +
                                "um real e " +
                                "um centavo";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testMilEDois() {
        final Double valor = (double) 1002.00;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "mil e dois reais";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testMilReaisEDoisCentavos() {
        final Double valor = (double) 1000.02;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "mil reais e dois centavos";

        assertEquals(esperado, extenso);
    }

    @Test
    public void testUmMilaoDeReaisEDoisCentavos() {
        final Double valor = (double) 1000000.03;
        final String extenso = new Extenso(valor).toString();
        final String esperado = "um milhão de reais e três centavos";

        assertEquals(esperado, extenso);
    }
}