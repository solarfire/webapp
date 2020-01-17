package sco.co.so.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value="init")
    public WelcomeBean get() {
        return new WelcomeBean(System.getProperty("os.name"));
    }
}
