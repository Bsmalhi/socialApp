package com.happydev.socialApp.controllers.homePage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String welcomePage(){
        return "welcomePageNotSignedIn";
    }

    @RequestMapping(value = {"/", "/welcomepage"}, method = RequestMethod.GET)
    public String welcomePage2(){
        return "welcomePage";
    }
}
