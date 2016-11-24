package com.example.article.service;

import com.example.article.dto.ArticleCreateDTO;
import com.example.article.dto.ArticleRequestDTO;
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
     * @param articleCreateDTO
     * @return
     */
    public Article create(ArticleCreateDTO articleCreateDTO) {
        Article article = new Article(articleCreateDTO.getTitle(), articleCreateDTO.getContent(), articleCreateDTO.getPassword(), articleCreateDTO.getAuthor());
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
    public List<Article> findByTitle(ArticleRequestDTO articleRequestDTO){
        return articleRepository.findByTitle(articleRequestDTO.getTitle());
    }

    /**
     * 게시물 ID로 조회
     */
    public Article findById(ArticleRequestDTO articleRequestDTO){
        return articleRepository.findById(articleRequestDTO.getId());
    }

    /**
     * 게시물 삭제
     * @param articleRequestDTO
     */
    public void delete(ArticleRequestDTO articleRequestDTO){
        articleRepository.delete(articleRequestDTO.getId());
    }

}
