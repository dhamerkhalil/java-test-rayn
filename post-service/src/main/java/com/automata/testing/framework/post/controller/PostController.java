package com.automata.testing.framework.post.controller;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import com.automata.testing.framework.post.dto.PostDTO;
import com.automata.testing.framework.post.model.PostEntity;
import com.automata.testing.framework.post.service.PostServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Post controller.
 *
 * @author GELIBERT
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class PostController {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
// -------------------------------------- Private attributes
    /**
     * The post service to use.
     */
    private PostServiceImpl postService;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor

    @Autowired
    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }


    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods

    /**
     * Rest API for the creation of the post.
     *
     * @param post the post dto
     * @return the response entity
     */
    @PostMapping(path = "/post")
    public ResponseEntity<String> createPost(@RequestBody final PostDTO post) {
        log.info("Receiving the post {}", post);
        postService.createPost(post);
        return ResponseEntity.ok().build();
    }
    
    /**
     * Rest API to find a post by its id.
     *
     * @param id the identifier
     * @return the response entity
     */
    @GetMapping(path = "/post/{id}")
    public ResponseEntity<PostEntity> createPost(@PathVariable(name = "identifier") final Integer id) {
        log.info("Trying to find the post with id {}", id);
        Optional<PostEntity> result = postService.getPost(id);
        if(result.isPresent()){
            return ResponseEntity.ok(result.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * Rest API to delete a post by its id.
     *
     * @param id the identifier
     * @return the response entity
     */
    @DeleteMapping(path = "/post/{id}")
    public ResponseEntity<PostEntity> deletePost(@PathVariable(name = "identifier") final Integer id) {
        log.info("Trying to delete the post with id {}", id);
        Optional<PostEntity> result = postService.getPost(id);
        if(result.isPresent()){
            return ResponseEntity.ok(result.get());
        }else{
            return ResponseEntity.badRequest().build();
        }
    }
    // -------------------------------------- Setters and Getters
    
}
