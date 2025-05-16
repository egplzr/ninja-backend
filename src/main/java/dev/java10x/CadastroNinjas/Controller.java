package dev.java10x.CadastroNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class Controller {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello world!";
    }
}
