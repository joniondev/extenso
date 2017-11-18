package br.eti.romel.lounge.extenso.web;

import br.eti.romel.lounge.extenso.*;
import java.io.*;
import java.math.*;
import javax.enterprise.context.*;
import javax.enterprise.inject.*;

@Model
@RequestScoped
public class MoedaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal valor;
    private String extenso;

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setExtenso(String extenso) {
        this.extenso = extenso;
    }

    public String getExtenso() {
        return this.extenso;
    }

    public void transcrever() {
        this.extenso = new Extenso(this.valor).toString();
    }
}
