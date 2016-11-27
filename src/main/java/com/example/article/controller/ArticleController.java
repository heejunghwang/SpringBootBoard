package com.example.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jane on 2016-11-22.
 */
@Controller
public class ArticleController {
    @GetMapping("/test")
    public String welcome(Model model) {
        model.addAttribute("message", "Hello World");
        return "welcome";
    }
}
