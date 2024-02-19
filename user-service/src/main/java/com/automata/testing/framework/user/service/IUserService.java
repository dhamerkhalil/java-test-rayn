package com.automata.testing.framework.user.service;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import com.automata.testing.framework.user.dto.UserDTO;
import com.automata.testing.framework.user.dto.UserSignupDTO;


/**
 * The interface of user service.
 *
 * @author GELIBERT
 */
public interface IUserService {
    
    // -------------------------------------- Public methods
    
    /**
     * Create a new user.
     *
     * @param user the user to create.
     * @return the user created.
     */
    UserDTO createUser(UserSignupDTO user);
    
}
