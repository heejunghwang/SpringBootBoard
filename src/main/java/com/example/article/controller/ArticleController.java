package com.example.article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by jane on 2016-11-22.
 */
@RestController
public class ArticleController {
    @GetMapping("/test")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Hello World");
        return "welcome";
    }
}
