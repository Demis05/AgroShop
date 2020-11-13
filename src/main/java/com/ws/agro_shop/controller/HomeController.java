package com.ws.agro_shop.controller;

import com.ws.agro_shop.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private ProductServiceImpl productService;

    @Value("${upload.path}")
    private String uploadPath;

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
