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
public class Tag {
    @Id
    @GeneratedValue
    private Long id;

    /* 태그 제목*/
    private String title;

    public Tag(){}

    public Tag(String title) {
        this.title = title;
    }

}
