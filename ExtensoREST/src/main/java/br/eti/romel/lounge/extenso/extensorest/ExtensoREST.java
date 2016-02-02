/**
 * Copyright (c) 2016 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso.extensorest;

import br.eti.romel.lounge.extenso.ejb.*;
import java.math.*;
import static spark.Spark.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
public class ExtensoREST implements spark.servlet.SparkApplication {

    @Override
    public void init() {
        get("/extenso/:numero", (req, res) -> {
            final String parametro = req.params(":numero");
            final BigDecimal numero = new BigDecimal(parametro);
            final ExtensoBeanRemote extensoBean = new ExtensoBean();

            return String.format("REST(%s)", extensoBean.extenso(numero));
    });
    }
}
