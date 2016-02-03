package com.example.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class IndexController {
 
    @RequestMapping("/hello")
    public String showHomePage(Model m) {
        m.addAttribute("name", "Hello");
        return "index";
    }
}