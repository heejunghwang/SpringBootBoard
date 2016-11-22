package com.example.article.repository;

import com.example.article.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hwang on 2016-10-22.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
