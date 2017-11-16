import br.eti.romel.lounge.extenso.ws.ExtensoWS;
import br.eti.romel.lounge.extenso.ws.ExtensoWS_Service;
import static junit.framework.TestCase.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
public class WSClientTest {

    private static ExtensoWS extensoWS;

    @BeforeClass
    public static void setUpClass() {
        extensoWS = new ExtensoWS_Service().getExtensoWSPort();
    }

    @Test
    public void nineNineRedBallons() {

        assertEquals("noventa e nove reais", extensoWS.extenso("99"));
    }
}
