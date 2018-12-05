package com.happydev.socialApp.WebControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping(value = {"/", "/homepage"}, method = RequestMethod.GET)
    public String welcomePage(){
        return "welcomePageNotSignedIn";
    }
}
