package com.automata.testing.framework.post.service;

import com.automata.testing.framework.post.dto.PostDTO;
import com.automata.testing.framework.post.model.PostEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

/**
 * Dependencies
 */

/**
 * The post handling service.
 *
 * @author GELIBERT
 */
public interface IPostService {

    // -------------------------------------- Public methods

    /**
     * Create the post, and encrypt the content in the database.
     *
     * @param post the dto representing the post.
     * @return
     */
    Integer createPost(PostDTO post);

    /**
     * Find a post by its id.
     *
     * @param id the id
     * @return
     */
    Optional<PostEntity> getPost(Integer id);

    /**
     * delete a post by its id.
     *
     * @param id the id
     * @return Optional of post entity
     */
    public Optional<PostEntity> deletePost(final Integer id);
}
