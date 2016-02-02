/*
 * Copyright (c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso.ejb;

import br.eti.romel.lounge.extenso.*;
import java.io.*;
import java.math.*;
import javax.ejb.*;

@Stateless
public class ExtensoBean implements Serializable, ExtensoBeanRemote {

    /**
     *
     * @param valor
     * @return
     */
    @Override
    public String extenso(BigDecimal valor) {
        Extenso extenso = new Extenso(valor);

        return String.format("EJB(%s)", extenso.toString());
    }
}
