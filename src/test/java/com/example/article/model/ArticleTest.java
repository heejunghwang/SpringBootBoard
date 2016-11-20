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

    @Test(expected = IllegalArgumentException.class)
    public void setAuthorTest(){
        try{
            new Article("title", "contents", "22222222222222222222222222");
        }catch(IllegalArgumentException e){
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }

        Assert.fail();
    }
}