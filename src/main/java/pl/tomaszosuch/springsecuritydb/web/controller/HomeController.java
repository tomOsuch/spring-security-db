package pl.tomaszosuch.springsecuritydb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    private String home(){
        return "index";
    }

    @RequestMapping("/secured")
    public String secured(){
        return "secured";
    }
}
