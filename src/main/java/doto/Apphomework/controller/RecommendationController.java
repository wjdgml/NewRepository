package doto.Apphomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    @GetMapping("/")
    public String helloController() {
        return "To-do Application Test!";
    }
}
