/**
 * Copyright 2017 Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
package br.eti.romel.lounge.javaonion.extenso.heroku;

import br.eti.romel.lounge.extenso.*;
import java.math.*;
import java.util.*;
import javax.ws.rs.core.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String index() {

        return "index";
    }

    @ResponseBody()
    @RequestMapping(path = "/v1/extenso/{valor}",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON)
    Map<String, String> extenso(@PathVariable String valor, Map<String, Object> model) {
        Map<String, String> resultado = new HashMap<>();
        resultado.put("valor", valor);
        resultado.put("extenso", new Extenso(new BigDecimal(valor)).toString());

        return resultado;
    }
}
