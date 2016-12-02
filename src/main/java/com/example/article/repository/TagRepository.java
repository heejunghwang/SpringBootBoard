package com.example.article.repository;

import com.example.article.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hwang on 2016-10-22.
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    /**
     * 해당 게시물에 해당하는 태그 조회
     * @return
     */
    List<Tag> findAll();
}
