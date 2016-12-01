package com.example.article.service;

import com.example.article.dto.TagCreateDTO;
import com.example.article.model.Tag;
import com.example.article.repository.TagRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jane on 2016-12-01.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TagServiceTest {
    @Autowired
    TagService tagService;

    public void createTest(){
        tagService.create(new TagCreateDTO("태그"));
    }

    //태그를 삭제를 한다.
}
