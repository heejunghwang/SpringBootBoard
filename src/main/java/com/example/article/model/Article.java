package com.example.article.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by hwang on 2016-11-14.
 */

/* Annotation 정리
* @ToString : let lombok generate an implementation of the toString() method
* */

@Entity
@Getter
@ToString
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;
    private String author;
    private Date created;

    //기본 생성자 반드시 구현 되어있어야함
    protected Article(){}

    public Article(String title, String contents, String author) {
        this.title = title;
        this.contents = contents;
        this.setAuthor(author);
        this.created = new Date();
    }

    //Validation check for author
    private void setAuthor(String author) {
        if(author.length() > 20){
            throw new IllegalArgumentException("사용자 이름은 20자 이상 사용할 수 없습니다");
        } else{
            this.author = author;
        }
    }
}
