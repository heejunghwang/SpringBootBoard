package com.example.article.controller;

import com.example.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jane on 2016-11-22.
 */
@Controller
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/test")
    public String welcome(Model model) {
        model.addAttribute("message", "Hello World");
        return "welcome";
    }

}
