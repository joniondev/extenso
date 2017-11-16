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
public class TiposTest {

    @Test
    public void intTest() {
        final int valor = 1;
        final String esperado = "um real";

        assertEquals(esperado, new Extenso(valor).toString());
    }

    @Test
    public void floatTest() {
        final float valor = (float) 1.01;
        final String esperado = "um real e um centavo";

        assertEquals(esperado, new Extenso(valor).toString());
    }

    @Test
    public void floatObjectTest() {
        final Float valor = new Float(1.02);
        final String esperado = "um real e dois centavos";

        assertEquals(esperado, new Extenso(valor).toString());
    }

    @Test
    public void doubleTest() {
        final double valor = 1.11;
        final String esperado = "um real e onze centavos";

        assertEquals(esperado, new Extenso(valor).toString());
    }

    @Test
    public void doubleObjectTest() {
        final Double valor = new Double(1.19);
        final String esperado = "um real e dezenove centavos";

        assertEquals(esperado, new Extenso(valor).toString());
    }

    @Test
    public void bigDecimalTest() {
        final BigDecimal valor = new BigDecimal("123456789012345678901234567890123456789012345678901234567890123456.78");
        final String esperado = "cento e vinte e três vigesilhões, " +
                                "quatrocentos e cinquenta e seis novedecilhões, " +
                                "setecentos e oitenta e nove octodecilhões, " +
                                "doze setedecilhões, " +
                                "trezentos e quarenta e cinco sexdecilhões, " +
                                "seiscentos e setenta e oito quindecilhões, " +
                                "novecentos e um quatordecilhões, " +
                                "duzentos e trinta e quatro tredecilhões, " +
                                "quinhentos e sessenta e sete duodecilhões, " +
                                "oitocentos e noventa undecilhões, " +
                                "cento e vinte e três decilhões, " +
                                "quatrocentos e cinquenta e seis nonilhões, " +
                                "setecentos e oitenta e nove octilhões, " +
                                "doze septilhões, " +
                                "trezentos e quarenta e cinco sextilhões, " +
                                "seiscentos e setenta e oito quintilhões, " +
                                "novecentos e um quatrilhões, " +
                                "duzentos e trinta e quatro trilhões, " +
                                "quinhentos e sessenta e sete bilhões, " +
                                "oitocentos e noventa milhões, " +
                                "cento e vinte e três mil, " +
                                "quatrocentos e cinquenta e seis reais e " +
                                "setenta e oito centavos";
        final String extenso = new Extenso(valor).toString();

        assertEquals(esperado, extenso);
    }
}