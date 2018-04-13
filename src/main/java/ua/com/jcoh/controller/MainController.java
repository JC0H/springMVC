package ua.com.jcoh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.jcoh.service.UserService;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String toMainPage(){
        userService.findAll();
        return "index";
    }

}
