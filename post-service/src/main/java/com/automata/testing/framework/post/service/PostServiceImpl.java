package com.automata.testing.framework.post.service;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import com.automata.testing.framework.post.dto.PostDTO;
import com.automata.testing.framework.post.model.PostEntity;
import com.automata.testing.framework.post.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * Dependencies
 */

/**
 * Post service implementation.
 *
 * @author GELIBERT
 */
public class PostServiceImpl implements IPostService {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * Loading the post repository in order to load datas.
     */
    @Autowired
    private IPostRepository postRepo;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    /**
     * {@inheritDoc}
     */
    public Integer createPost(final PostDTO post) {
        final PostEntity postDoc = PostEntity.builder().content(post.getContent()).userId(post.getUser().getUserId())
                .userFirstName(post.getUser().getFirstName()).userLastName(post.getUser().getLastName()).build();
        // TODO - Encrypt the Content
        return postRepo.save(postDoc).getId();
        
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<PostEntity> getPost(final Integer id) {
        return postRepo.findById(id);
    }
    
    // -------------------------------------- Setters and Getters
    
}
