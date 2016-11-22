package com.example.article.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hwang on 2016-11-14.
 */

@Entity
@Getter
@ToString
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;
    @ManyToOne
    private Tag tag;
    @ManyToOne
    private Comment comment;
    private String author;
    private String password;
    private Date created;

    //기본 생성자 반드시 구현 되어있어야함
    protected Article(){}

    public Article(String title, String contents, String password, String author) {
        this.title = title;
        this.contents = contents;
        this.password = password;
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

    public Article(String title, String contents, Tag tag, Comment comment, String author, String password) {
        this.title = title;
        this.contents = contents;
        this.tag = tag;
        this.comment = comment;
        this.author = author;
        this.password = password;
    }
}
