package com.automata.testing.framework.post.service;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import com.automata.testing.framework.algorithm.service.IDecryptionService;
import com.automata.testing.framework.algorithm.service.IEncryptionService;
import com.automata.testing.framework.post.dto.PostDTO;
import com.automata.testing.framework.post.model.PostEntity;
import com.automata.testing.framework.post.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Dependencies
 */

/**
 * Post service implementation.
 *
 * @author GELIBERT
 */
@Service
public class PostServiceImpl implements IPostService {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * Loading the post repository in order to load datas.
     */
    private final IPostRepository postRepo;

    /**
     * event publisher
     */
    private final ApplicationEventPublisher eventPublisher;

    /**
     * Encryption service to use.
     */
    private final IEncryptionService encryptionService;

    /**
     * Encryption service to use.
     */
    private final IDecryptionService decryptionService;

    // -------------------------------------- public attributes


    // -------------------------------------- Constructor
    @Autowired
    public PostServiceImpl(IPostRepository postRepo, ApplicationEventPublisher eventPublisher, IEncryptionService encryptionService, IDecryptionService decryptionService) {
        this.postRepo = postRepo;
        this.eventPublisher = eventPublisher;
        this.encryptionService = encryptionService;
        this.decryptionService = decryptionService;
    }


    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    /**
     * create new post and send propagate event
     * @param post
     * return id of the created post
     */
    public Integer createPost(final PostDTO post) {
        final PostEntity postDoc = PostEntity.builder().content(encryptionService.encode(post.getContent())).userId(Integer.parseInt(post.getUser().getUserId()))
                .userFirstName(post.getUser().getFirstName()).userLastName(post.getUser().getLastName()).build();

        eventPublisher.publishEvent(postDoc);
        return postRepo.save(postDoc).getId();
        
    }
    
    /**
     * get post by id
     * @param id post it
     * return PostEntity
     */
    @Override
    public Optional<PostEntity> getPost(final Integer id) {
        Optional<PostEntity> result = postRepo.findById(id);
            if(result.isPresent()){
                PostEntity encryptedPostContent = result.get();
                encryptedPostContent.setContent(decryptionService.decode(encryptedPostContent.getContent()));
                return Optional.of(encryptedPostContent);
            }
        return Optional.empty();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<PostEntity> deletePost(final Integer id) {
        Optional<PostEntity> postToDelete = postRepo.findById(id);
        if(postToDelete.isPresent()){
            PostEntity post = postToDelete.get();
            post.setDeleted(true); // soft delete
            postRepo.save(post);
            return Optional.of(post);
        }
        return Optional.empty();
    }
    
    // -------------------------------------- Setters and Getters
    
}
