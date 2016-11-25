package com.example.article.service;

import com.example.article.dto.ArticleCreateDTO;
import com.example.article.dto.ArticleRequestDTO;
import com.example.article.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArticleServiceTest {

    @Autowired
    ArticleService articleService;

    @Before
    public void 게시물_테스트_데이터_생성하기(){
        Article a1 = articleService.create(new ArticleCreateDTO("방가방가", "만나서 반가워요", "pw", "autor"));
        Article a2 = articleService.create(new ArticleCreateDTO("안녕하세요. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
    }

    @Test
    public void 게시물생성하기(){
        //1. given
        //@Before에서 조건 지정함

        //2. when
        List<Article> articles = articleService.findAll();

        //3. then
        Assert.assertEquals(articles.get(0).getTitle(), "방가방가");
    }

    @Test
    public void 게시물_제목으로_조회하기(){
        //1. given
        Article a1 = articleService.create(new ArticleCreateDTO("방가방가", "만나서 반가워요", "pw", "autor"));
        Article a2 = articleService.create(new ArticleCreateDTO("안녕하세요. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));

        //2. when
        List<Article> results = articleService.findByTitle(new ArticleRequestDTO(null,"title", null, null, null));

        //3. then
    }

    @Test
    public void 게시물_삭제하기(){
        //1. given
        Article article = articleService.create(new ArticleCreateDTO("title", "content", "pw", "autor"));

        //2. when
        articleService.delete(new ArticleRequestDTO(Long.parseLong("1"), null, null, null, null));

        //삭제하는 로직 때문에 DTO가 변경되어야 하는 부분이 있을 수 있음
        //DTO를 새로 만드는게 나음

        //3. then
        List<Article> articles = articleService.findAll();
        //Assert.assertEquals(articles.get(0).getTitle(), "title");

        //TODO : delete 시 리턴값 확인하기
    }

    @Test
    public void 게시물_페이징_보여주기(){

    }

    @Test
    public void 코멘트_저장하기(){

    }

}
