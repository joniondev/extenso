/*
 * Copyright (c) 2012, 2017 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso.ejb;

import br.eti.romel.lounge.extenso.*;
import java.io.*;
import java.math.*;
import javax.ejb.*;
import javax.inject.*;

@Named
@Stateless
public class ExtensoBean implements Serializable, ExtensoBeanRemote {

    /**
     *
     * @param valor a ser representado por extenso.
     *
     * @return valor em sua representação extensa.
     */
    @Override
    public String extenso(BigDecimal valor) {
        Extenso extenso = new Extenso(valor);

        return String.format("EJB(%s)", extenso.toString());
    }
}
