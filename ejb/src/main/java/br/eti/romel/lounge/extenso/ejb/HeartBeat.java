/*
 * Copyright (c) 2017 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso.ejb;

import java.io.*;
import java.math.*;
import java.util.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
//@Singleton
//@Startup
public class HeartBeat implements Serializable, HeartBeatLocal {

//    @EJB
    private ExtensoBeanRemote extenso;

    @Override
//    @Schedule(hour = "*", minute = "*", second = "*/10", persistent = false)
    public void verificador() {
        final String mensagem = "%s milissegundos em reais: %s%n";
        final long segundo = Calendar.getInstance().getTimeInMillis();
        final BigDecimal valor = new BigDecimal(segundo);

        System.out.printf(mensagem, valor, extenso.extenso(valor));
    }
}
