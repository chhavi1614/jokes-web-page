package spring.start.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.start.services.NewJokeService;

@Controller
public class MvcController {

    private final NewJokeService newJokeService;

    public MvcController(NewJokeService newJokeService) {
        this.newJokeService = newJokeService;
    }

    @RequestMapping({"/",""})
    public String getNewJoke(Model model) {
        model.addAttribute("jokes",newJokeService.sayNewJoke());
        return "chucknorris";
    }

}
