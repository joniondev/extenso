package br.eti.romel.lounge.extenso.money;

import br.eti.romel.lounge.extenso.ejb.*;
import java.math.*;
import java.util.*;
import javax.ejb.*;

@Stateless
public class MoneyBean {

    /*
        java:global/ejb-1.0-SNAPSHOT/ExtensoBean!br.eti.romel.lounge.extenso.ejb.ExtensoBeanRemote
        java:app/ejb-1.0-SNAPSHOT/ExtensoBean!br.eti.romel.lounge.extenso.ejb.ExtensoBeanRemote
        java:module/ExtensoBean!br.eti.romel.lounge.extenso.ejb.ExtensoBeanRemote
        java:jboss/exported/ejb-1.0-SNAPSHOT/ExtensoBean!br.eti.romel.lounge.extenso.ejb.ExtensoBeanRemote
        java:global/ejb-1.0-SNAPSHOT/ExtensoBean
        java:app/ejb-1.0-SNAPSHOT/ExtensoBean
        java:module/ExtensoBean
     */
    @EJB(mappedName = "java:global/ejb-1.0-SNAPSHOT/ExtensoBean!br.eti.romel.lounge.extenso.ejb.ExtensoBeanRemote")
    private ExtensoBeanRemote bean;

    @Schedule(hour = "*", minute = "*", second = "*/10", persistent = false)
    public void businessMethod() {
        long millis = Calendar.getInstance().getTimeInMillis();
        System.out.println(bean.extenso(new BigDecimal(millis)));
    }
}
