package com.ws.agro_shop.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String base(Model model) {
        model.addAttribute("message", "Hello Page");
        return "home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("messages", "Hello Page");
        return "home";
    }
}
