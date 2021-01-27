package com.ws.agro_shop.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tests/")
@RestController
public class HomeController {

    @GetMapping("/main")
    public String base(Model model) {
        model.addAttribute("message", "Hello Page");
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
                "<body>\n" + "Hello world\n" + "</body>\n" + "</html>";
//        return "home.html";
    }

}
