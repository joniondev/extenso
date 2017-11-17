package br.eti.romel.lounge.extenso.wsclient;

import br.eti.romel.lounge.extenso.ws.*;
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
    public void nineNineRedBallons() {

        /**
         * O formato WS(.*) foi usado para evidenciar a origem da informação.
         */
        assertEquals("WS(noventa e nove reais)", extensoWS.extenso("99"));
    }
}
