package us.pdavidson.playtime.spring.clound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlaytimeController {

    private final PlaytimeService service;

    @Autowired
    public PlaytimeController(PlaytimeService service) {
        this.service = service;
    }


    @RequestMapping("/")
    @ResponseBody
    String message() {
        return service.getMessage();
    }


}
