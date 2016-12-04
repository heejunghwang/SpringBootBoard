package com.example.article.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hwang on 2016-11-19.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ArticleTest {

    @Test
    public void setAuthorTest(){
        //1. given
        Article article = new Article();

        //2. when
        //ReflectionTestUtils.invokeMethod(article, "setAuthor", "author");
        article.setAuthor("setAuthor");

        //3. then
        Assert.assertEquals(article.getAuthor(), "author");
    }
}