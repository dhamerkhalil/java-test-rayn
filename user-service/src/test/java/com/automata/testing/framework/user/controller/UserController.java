package com.automata.testing.framework.user.controller;
/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

import com.automata.testing.framework.commons.exceptions.AutomataBusinessException;
import com.automata.testing.framework.user.dto.UserDTO;
import com.automata.testing.framework.user.dto.UserSignupDTO;
import com.automata.testing.framework.user.service.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static com.automata.testing.framework.user.controller.UserController.API_ROOT;

/**
 * Users REST Controller.
 *
 * @author SEGURA
 */
@RestController
@RequestMapping(API_ROOT)
@Slf4j
public class UserController {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    /**
     * Users API root.
     */
    public static final String API_ROOT = "/api/users";
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * The user Service.
     */
    @Autowired
    private IUserService userService;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    /**
     * Rest API for the creation of the user.
     *
     * @param user the user
     * @return the response entity
     */
    @PostMapping
    @Operation(description = "Create a new user.")
    @ApiResponse(responseCode = "201", description = "User created, location in the header.")
    public ResponseEntity<UserDTO> createUser(@RequestBody final UserSignupDTO user) {
        log.debug("Create new user with email {}", user.getEmailAddress());
        final UserDTO userCreated = userService.createUser(user);
        final URI locationURI = UriComponentsBuilder.fromPath(API_ROOT + "/{id}").build(userCreated.getUserId());
        return ResponseEntity.created(locationURI).body(userCreated);
    }
    
    // -------------------------------------- Setters and Getters
    
}
