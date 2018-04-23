package at.refugeescode.mp17_the_thieves_den;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeEndpoint {

    @GetMapping
    String message() {
        return "the treasures hahahahahaha";
    }

}
