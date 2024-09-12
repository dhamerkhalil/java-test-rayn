package com.automata.testing.framework.user.service;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */


/**
 * Dependencies
 */

import com.automata.testing.framework.algorithm.service.IEncryptionService;
import com.automata.testing.framework.user.dto.UserDTO;
import com.automata.testing.framework.user.dto.UserSignupDTO;
import com.automata.testing.framework.user.model.UserEntity;
import com.automata.testing.framework.user.repository.IUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * The Implementation of the service.
 *
 * @author GELIBERT
 * @author SEGURA
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes

    private final IUserRepository userRepository;

    /**
     * Encryption service to use.
     */
    private final IEncryptionService encryptionService;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor


    @Autowired
    public UserServiceImpl(IUserRepository userRepository, IEncryptionService encryptionService) {
        this.userRepository = userRepository;
        this.encryptionService = encryptionService;
    }
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    /**
     * {@inheritDoc}
     */
    @Override
    public UserDTO createUser(final UserSignupDTO user) {
        log.info("Saving data for user {}", user);
        // We create the user in database.
        final UserEntity savingUser = UserEntity.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .password(encryptionService.encode(user.getPassword()))
                .build();
        log.debug("Saving the user {}", user);
        return this.convertToDto(userRepository.save(savingUser));
    }
    
    /**
     * Convert entity to DTO.
     *
     * @param user the {@link com.automata.testing.framework.user.model.UserEntity} to convert
     * @return the created DTO.
     */
    private UserDTO convertToDto(final UserEntity user) {
        return UserDTO.builder()
                .userId(user.getId().toString())
                .emailAddress(user.getEmailAddress())
                .firstName(user.getFirstName())
                .lastName(user.getLastName()).build();
    }
    
    // -------------------------------------- Setters and Getters
    
}
