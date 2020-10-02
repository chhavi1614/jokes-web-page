package spring.start.Contoller;

import org.springframework.stereotype.Controller;
import spring.start.services.NewJokeService;

@Controller
public class MvcController {

    private final NewJokeService newJokeService;

    public MvcController(NewJokeService newJokeService) {
        this.newJokeService = newJokeService;
    }

    public String getNewJoke() {
        return newJokeService.sayNewJoke();
    }


}
