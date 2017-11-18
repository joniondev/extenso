/*
 * Copyright (c) 2012, 2017 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso.ejb;

import br.eti.romel.lounge.extenso.*;
import java.io.*;
import java.math.*;
import java.util.logging.*;
import javax.ejb.*;
import javax.inject.*;

@Named
@Stateless
public class ExtensoBean implements Serializable, ExtensoBeanRemote {
    private final double versao;

    public ExtensoBean() {
        this.versao = Math.random();
    }

    /**
     *
     * @param valor a ser representado por extenso.
     *
     * @return valor em sua representação extensa.
     */
    @Override
    public String extenso(BigDecimal valor) {
        Extenso extenso = new Extenso(valor);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExtensoBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        return String.format("%f-EJB(%s)", this.versao, extenso.toString());
    }
}
