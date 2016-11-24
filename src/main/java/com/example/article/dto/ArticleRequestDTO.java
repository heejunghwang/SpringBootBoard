package com.example.article.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by hwang on 2016-11-19.
 */

@Data
@AllArgsConstructor
public class ArticleRequestDTO {
    private Long id;
    private String title;
    private String content;
    private String password;
    private String author;
}
