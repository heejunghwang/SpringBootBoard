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
        Article a1 = articleService.create(new ArticleCreateDTO("It's awesome", "만나서 반가워요", "pw", "autor"));
        Article a2 = articleService.create(new ArticleCreateDTO("방금 가입했어요~~", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));

        //2. when
        List<Article> results = articleService.findByTitle(new ArticleRequestDTO(null,"title", null, null, null));

        //3. then
    }

    @Test
    public void 게시물_삭제하기(){
        //1. given
        Article article = articleService.create(new ArticleCreateDTO("title", "content", "pw", "autor"));

        //2. when
        //TODO : 비밀번호가 맞을 시에만 게시물 삭제 가능
        //TODO : DTO 분리하기
        articleService.delete(new ArticleRequestDTO(1L, null, null, null, null));

        //3. then
        List<Article> articles = articleService.findAll();
        //Assert.assertEquals(articles.get(0).getTitle(), "title");

    }

    @Test
    public void 게시물_페이징_보여주기(){
        //1. given
        //TODO : List로 구현하기
        Article a3 = articleService.create(new ArticleCreateDTO("12월 입니다!", "만나서 반가워요", "pw", "autor"));
        Article a4 = articleService.create(new ArticleCreateDTO("내년이 얼마 남지 않았네요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a5 = articleService.create(new ArticleCreateDTO("맥북 얼마인가요?", "만나서 반가워요", "pw", "autor"));
        Article a6 = articleService.create(new ArticleCreateDTO("맥도날드 신메뉴를 먹어보았습니다", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a7 = articleService.create(new ArticleCreateDTO("내년에는 꼭 운동하고 싶어요", "만나서 반가워요", "pw", "autor"));
        Article a8 = articleService.create(new ArticleCreateDTO("근처에 헬스장 괜찮은 곳 있나요?", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a9 = articleService.create(new ArticleCreateDTO("★광고★", "만나서 반가워요", "pw", "autor"));
        Article a10 = articleService.create(new ArticleCreateDTO("회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a11 = articleService.create(new ArticleCreateDTO("방가방가11", "만나서 반가워요", "pw", "autor"));
        Article a12 = articleService.create(new ArticleCreateDTO("안녕하세요12. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));
        Article a13 = articleService.create(new ArticleCreateDTO("방가방가13", "만나서 반가워요", "pw", "autor"));
        Article a14 = articleService.create(new ArticleCreateDTO("안녕하세요14. 회원가입했어요", "안녕하세요. 회원가입했어요. 잘부탁드려요", "pw", "autor"));

        //2.when
        Page<Article> articlePage = articleService.findAll(new PageRequest(0, 10));

        //3.then
        // 한 페이지 아이템 10개, 0번째 페이지 호출
    }

    //TODO : 게시물 조회를 한다.

    //TODO : 전체 글 갯수를 조회한다.


    //TODO : @PostContruct 사용해서 샘플 데이터 넣기
}
