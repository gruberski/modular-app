package pl.gruberski.second.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping("/second")
    public String index() {
        return "Second";
    }
}
