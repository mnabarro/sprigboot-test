package springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsEndpoint {

    @GetMapping("/greetings")
    public String greetingsGet() {

        return "Hello!";
    }
}
