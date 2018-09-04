package pl.gruberski.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pl.gruberski.first.FirstConfiguration;
import pl.gruberski.second.SecondConfiguration;

@SpringBootApplication
@Import({FirstConfiguration.class, SecondConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
