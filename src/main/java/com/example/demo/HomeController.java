package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/CrabCakes")
    public String fish(){
        return "CrabCakes";
    }
    @RequestMapping("/Waffles")
    public String other(){
        return "Waffles";
    }
    @RequestMapping("/tiramisu")
    public String dessert(){
        return "tiramisu";
    }
    @RequestMapping("/gallery")
    public String photos(){
        return "gallery";
    }
}

