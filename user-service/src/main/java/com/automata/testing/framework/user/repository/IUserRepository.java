package com.automata.testing.framework.user.repository;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import com.automata.testing.framework.user.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * The user repository, used to store data and manipulate it.
 *
 * @author GELIBERT
 */
public interface IUserRepository extends CrudRepository<UserEntity, Integer> {
    
    // -------------------------------------- Public methods
    
    Optional<UserEntity> findByEmailAddress(String string);
    
}
