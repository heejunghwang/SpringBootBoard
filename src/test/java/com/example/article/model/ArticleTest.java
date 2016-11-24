package com.example.article.model;

import com.example.article.service.ArticleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by hwang on 2016-11-19.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ArticleTest {
    @Autowired
    ArticleService articleService;

    @Test(expected = IllegalArgumentException.class)
    public void setAuthorTest(){
        //1.given
        Article a1 = new Article("title", "contents", "pw", "22222222222222222222222222");

        //2.when
        List<Article> articles = articleService.findAll();

        //3.then
        Assert.fail();
    }
}