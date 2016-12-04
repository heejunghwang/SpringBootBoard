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

    /* 게시물 제목*/
    private String title;

    /* 게시물 내용*/
    private String contents;

    /* 게시물 태그*/
    @ManyToOne
    private Tag tag;

    /* 게시물 댓글*/
    //TODO : List
    @ManyToOne
    private Comment comment;

    //TODO : author, password 등 반복적인 부분 처리
    /* 게시물 작성자*/
    private String author;

    /* 게시물 비밀번호*/
    private String password;

    /* 게시물 등록일시*/
    private Date created;

    protected Article(){}

    public Article(String title, String contents, String password, String author) {
        this.title = title;
        this.contents = contents;
        this.password = password;
        this.setAuthor(author);
        this.created = new Date();
    }

    //Validation check for author
    void setAuthor(String author) {
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
