/**
 * Copyright (c) 2013, 2017 Carlos Romel Pereira da Silva
 * <carlos.romel@gmail.com>
 *
 * WebService responsável por traduzir um valor monetário.
 */
package br.eti.romel.lounge.extenso.ws;

import br.eti.romel.lounge.extenso.*;
import java.math.*;
import javax.jws.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
@WebService(serviceName = "ExtensoWS")
public class ExtensoWS {

    /**
     * Tradução de um valor monetário em seu equivalente por extenso.
     *
     * @param valor a ser traduzido.
     *
     * @return Extenso do valor informado.
     */
    @WebMethod(operationName = "extenso")
    public String extenso(@WebParam(name = "valor") final String valor) {
        return String.format("WS(%s)", new Extenso(new BigDecimal(valor)).toString());
    }
}
