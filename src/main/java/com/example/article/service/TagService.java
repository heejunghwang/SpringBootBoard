package com.example.article.service;

import com.example.article.dto.TagCreateDTO;
import com.example.article.model.Tag;
import com.example.article.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jane on 2016-12-01.
 */
@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;

    public Tag create(TagCreateDTO tagCreateDTO){
        return tagRepository.save(new Tag(tagCreateDTO.getTitle()));
    }

}
