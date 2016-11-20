package com.example.article.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by hwang on 2016-11-19.
 */

/* Annotaion 정리
    @Data : a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together
    @AllArgsConstructor : Generates an all-args constructor
 */

@Data
@AllArgsConstructor
public class ArticleDTO {
    private String title;
    private String content;
    private String author;
}
