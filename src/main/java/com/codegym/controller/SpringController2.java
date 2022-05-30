package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class SpringController2 {
@RequestMapping("/")
    public String home(Model model){
    model.addAttribute("message","back to home!!");
    return "/home";
}
@RequestMapping("/index")
    public String index(Model model){
    model.addAttribute("message","index");
    return "/index";
}
}
