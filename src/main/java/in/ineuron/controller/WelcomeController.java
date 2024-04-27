package in.ineuron.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/greeting/{name}")
    public String greetings(@PathVariable String name) {
        return name.split(" ")[0] +"Welcome to Javatechie from jenkins with CD as Docker";
    }
}
