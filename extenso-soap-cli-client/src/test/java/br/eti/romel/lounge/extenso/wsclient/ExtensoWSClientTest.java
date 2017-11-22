package br.eti.romel.lounge.extenso.wsclient;

import static junit.framework.TestCase.assertEquals;
import org.junit.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
public class ExtensoWSClientTest {

    private static ExtensoWS extensoWS;

    @BeforeClass
    public static void setUpClass() {
        extensoWS = new ExtensoWS_Service().getExtensoWSPort();
    }

    @Test
    @Ignore
    public void nineNineRedBallons() {

        /**
         * O formato WS(.*) foi usado para evidenciar a origem da informação.
         */
        assertEquals("WS(noventa e nove reais)", extensoWS.extenso("99"));
    }
}
