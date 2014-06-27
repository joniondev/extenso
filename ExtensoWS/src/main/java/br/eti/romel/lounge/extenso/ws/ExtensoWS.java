/**
 * Copyright (c) 2013 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 *
 * WebService responsável por traduzir um valor monetário.
 */
package br.eti.romel.lounge.extenso.ws;

import br.eti.romel.lounge.extenso.ejb.*;
import java.math.*;
import javax.ejb.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
@WebService(serviceName = "ExtensoWS")
public class ExtensoWS {

    @EJB(mappedName = "java:global/ExtensoBeanRemote/ExtensoBean!br.eti.romel.lounge.extenso.ejb.ExtensoBean")
    private ExtensoBeanRemote extensoBean;

    /**
     * Tradução de um valor monetário em seu equivalente por extenso.
     *
     * @param valor a ser traduzido.
     *
     * @return Extenso do valor informado.
     */
    @WebMethod(operationName = "extenso")
    public String extenso(@WebParam(name = "valor") String valor) {
        return extensoBean.extenso(new BigDecimal(valor));
    }
}
