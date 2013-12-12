/*
 * Copyright (c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso.ejb;

import br.eti.romel.lounge.extenso.Extenso;
import java.io.*;
import java.math.BigDecimal;
import javax.ejb.Stateless;

@Stateless
public class ExtensoBean implements Serializable, ExtensoBeanLocal {

    /**
     *
     * @param valor
     * @return
     */
    @Override
    public String extenso(BigDecimal valor) {
        Extenso extenso = new Extenso(valor);

        return extenso.toString();
    }
}
