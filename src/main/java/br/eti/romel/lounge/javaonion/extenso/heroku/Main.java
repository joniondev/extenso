/**
 * Copyright 2017 Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
package br.eti.romel.lounge.javaonion.extenso.heroku;

import javax.ws.rs.core.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("bean", new Bean());

        return "index";
    }

    @PostMapping("/")
    public String converter(@ModelAttribute Bean bean) {

        return "index";
    }

    @ResponseBody()
    @RequestMapping(path = "/v1/extenso/{valor}",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON)
    Bean extenso(@PathVariable String valor) {

        return new Bean(valor);
    }
}
