package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("message","hello world!!");
        return "/index";
    }
}
