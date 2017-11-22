/**
 * Copyright (c) 2016, 2017 Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
package br.eti.romel.lounge.extenso.rest;

import br.eti.romel.lounge.extenso.*;
import java.math.*;
import static spark.Spark.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
public class ExtensoREST implements spark.servlet.SparkApplication {

    @Override
    public void init() {
        get("/extenso/:valor", (req, res) -> {
            String parametro = req.params(":valor");
            BigDecimal valor = new BigDecimal(parametro);

            return String.format("REST(%s)", new Extenso(valor).toString());
    });
    }
}
