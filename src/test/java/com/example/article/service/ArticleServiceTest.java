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
        //1. given
        Article a3 = articleService.create(new ArticleCreateDTO("방가방가3", "만나서 반가워요", "pw", "autor"));
        Article a4 = articleService.create(new ArticleCreateDTO("안녕하세요4. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a5 = articleService.create(new ArticleCreateDTO("방가방가5", "만나서 반가워요", "pw", "autor"));
        Article a6 = articleService.create(new ArticleCreateDTO("안녕하세요6. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a7 = articleService.create(new ArticleCreateDTO("방가방가7", "만나서 반가워요", "pw", "autor"));
        Article a8 = articleService.create(new ArticleCreateDTO("안녕하세요8. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a9 = articleService.create(new ArticleCreateDTO("방가방가9", "만나서 반가워요", "pw", "autor"));
        Article a10 = articleService.create(new ArticleCreateDTO("안녕하세요10. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a11 = articleService.create(new ArticleCreateDTO("방가방가11", "만나서 반가워요", "pw", "autor"));
        Article a12 = articleService.create(new ArticleCreateDTO("안녕하세요12. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a13 = articleService.create(new ArticleCreateDTO("방가방가13", "만나서 반가워요", "pw", "autor"));
        Article a14 = articleService.create(new ArticleCreateDTO("안녕하세요14. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));

        //2.when
        Page<Article> articlePage = articleService.findAll(new PageRequest(0, 10));

        //3.then
        // 한 페이지 아이템 10개, 0번째 페이지 호출
    }

    @Test
    public void 게시물_글번호_페이징_조회하기(){
        //1.given

        //2.when

        //3.then
    }

    @Test
    public void 코멘트_저장하기(){

    }

}
