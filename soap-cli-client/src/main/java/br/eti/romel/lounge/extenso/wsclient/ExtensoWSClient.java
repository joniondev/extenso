/**
 * Copyright (c) 2013, 2017 Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 *
 * Cliente (linha de comando) do ExtensoWS (prova de conceito).
 */
package br.eti.romel.lounge.extenso.wsclient;

import br.eti.romel.lounge.extenso.ws.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
public class ExtensoWSClient {

    public static void main(String[] args) {

        System.out.printf("Extenso: [%s]\n", extenso("999988887777666655554444333322221111"));
    }

    public static String extenso(String valor) {
        ExtensoWS extensoWS = new ExtensoWS_Service().getExtensoWSPort();
        return extensoWS.extenso(valor);
    }
}
