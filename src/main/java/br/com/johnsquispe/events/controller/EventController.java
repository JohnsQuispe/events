package br.com.johnsquispe.events.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    @GetMapping(value = "/cadastrar")
    public String cadastrar() {

        return "cadastrar";

    }

}
