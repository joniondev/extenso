package br.eti.romel.lounge.extenso.soapwebclient;

import br.eti.romel.lounge.extenso.wsclient.*;
import java.io.*;
import javax.enterprise.context.*;
import javax.enterprise.inject.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
@Model
@RequestScoped
public class ExtensoWSBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String valor;
    private String extenso;

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }

    public String getExtenso() {
        return this.extenso;
    }

    public void transcrever() {
        ExtensoWS extensoWS = new ExtensoWS_Service().getExtensoWSPort();

        this.extenso = extensoWS.extenso(this.valor);
    }
}
