package com.automata.testing.framework.post.repository;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import com.automata.testing.framework.post.model.PostEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Dependencies
 */

/**
 * The post repository.
 *
 * @author GELIBERT
 */
public interface IPostRepository extends CrudRepository<PostEntity, Integer> {
    
    // -------------------------------------- Public methods
    
}
