package com.example.article.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by hwang on 2016-11-23.
 */
@Entity
@Getter
@ToString
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    /* 코멘트 내용*/
    private String content;

    /* 코멘트 비밀번호*/
    private String password;

    public Comment(){}

    public Comment(String content, String password) {
        this.content = content;
        this.password = password;
    }
}
