package com.example.article.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by hwang on 2016-11-24.
 */
@Data
@AllArgsConstructor
public class ArticleCreateDTO {
    private String title;
    private String content;
    private String password;
    private String author;
}
