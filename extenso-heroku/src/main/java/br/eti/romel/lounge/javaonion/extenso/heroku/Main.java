/**
 * Copyright 2017 Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
package br.eti.romel.lounge.javaonion.extenso.heroku;

import br.eti.romel.lounge.extenso.*;
import java.math.*;
import java.util.*;
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

    @RequestMapping(path = "/v1/extenso/{valor}")
    String extenso(Map<String, Object> model, @PathVariable String valor) {

        model.put("extenso", new Extenso(new BigDecimal(valor)).toString());

        return "index";
    }
}
