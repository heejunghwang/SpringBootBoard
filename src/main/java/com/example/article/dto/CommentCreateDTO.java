package com.example.article.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by jane on 2016-12-01.
 */
@Data
@AllArgsConstructor
public class CommentCreateDTO {
    private String content;
    private String password;
}
