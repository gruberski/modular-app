package pl.gruberski.first.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gruberski.first.service.FirstService;
import pl.gruberski.second.service.SecondService;

@RestController
public class FirstController {

    private FirstService firstService;
    private SecondService secondService;

    public FirstController(FirstService firstService, SecondService secondService) {
        this.firstService = firstService;
        this.secondService = secondService;
    }

    @GetMapping("/first")
    public String index() {
        return "Data: " + firstService.getData() + " / " + secondService.getData();
    }
}
