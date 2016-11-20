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

    public Article create(ArticleDTO articleDTO) {
        Article article = new Article(articleDTO.getTitle(), articleDTO.getContent(), articleDTO.getAuthor());
        return articleRepository.save(article);
    }

    public List<Article> findAll(){
        return articleRepository.findAll();
    }

}
