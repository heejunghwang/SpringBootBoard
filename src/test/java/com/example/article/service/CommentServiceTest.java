package com.example.article.service;

import com.example.article.dto.CommentCreateDTO;
import com.example.article.model.Comment;
import com.example.article.repository.CommentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jane on 2016-12-01.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentServiceTest {
    @Autowired
    CommentService commentService;

    @Test
    public void createTest(){
        commentService.create(new CommentCreateDTO("댓글입니다", "1234"));
    }

    //해당 댓글을 삭제한다.
}
