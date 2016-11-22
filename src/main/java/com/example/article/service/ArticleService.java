package com.example.article.service;

import com.example.article.dto.ArticleDTO;
import com.example.article.model.Article;
import com.example.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hwang on 2016-11-19.
 */
@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    /**
     * 게시물 생성
     * @param articleDTO
     * @return
     */
    public Article create(ArticleDTO articleDTO) {
        Article article = new Article(articleDTO.getTitle(), articleDTO.getContent(), articleDTO.getPassword(), articleDTO.getAuthor());
        return articleRepository.save(article);
    }

    /**
     * 게시물 전체 조회
     * @return
     */
    public List<Article> findAll(){
        return articleRepository.findAll();
    }

    /**
     * 게시물 제목으로 조회
     * @return
     */
    public List<Article> findByTitle(ArticleDTO articleDTO){
        return articleRepository.findByTitle(articleDTO.getTitle());
    }

    /**
     * 게시물 삭제
     * @param articleDTO
     */
//    public void delete(ArticleDTO articleDTO){
//        articleRepository.delete(articleDTO.getId());
//    }

}
