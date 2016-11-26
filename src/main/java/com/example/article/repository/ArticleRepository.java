package com.example.article.repository;

import com.example.article.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hwang on 2016-10-22.
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    /**
     * 타이틀로 게시물 조회
     * @param article
     * @return
     */
    List<Article> findByTitle(String article);

    /**
     * ID로 게시물 조회
     * @param id
     * @return
     */
    Article findById(Long id);

    /**
     * 게시물 페이징 조회
     * @param pageable
     * @return
     */
    Page<Article> findAll(Pageable pageable);

}
