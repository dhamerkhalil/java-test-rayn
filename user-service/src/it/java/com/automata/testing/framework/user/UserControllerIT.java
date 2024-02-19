package com.automata.testing.framework.user;

import com.automata.testing.framework.user.controller.UserController;
import com.automata.testing.framework.user.dto.UserDTO;
import com.automata.testing.framework.user.dto.UserSignupDTO;
import com.automata.testing.framework.user.model.UserEntity;
import com.automata.testing.framework.user.repository.IUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

/**
 * Integration test suite for {@link com.automata.testing.framework.user.controller.UserController}.
 *
 * @author SEGURA
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = UserServiceApi.class)
@Slf4j
class UserControllerIT {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * The rest template, used to generate api call.
     */
    @Autowired
    private TestRestTemplate restTemplate;
    
    /**
     * The user repository, used to check datas.
     */
    @Autowired
    private IUserRepository userRepository;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    /**
     * Testing the user creation.
     */
    @Test
    @DisplayName("Given a user send his info to create an account, when he calls the POST endpoint, then the user is created and correctly returned.")
    void testCreationUserOk() {
        
        // User creation.
        final UserSignupDTO user = UserSignupDTO.builder().firstName("Blaise").lastName("Pascal").emailAddress("blaise.pascal@gmail.com")
                .password("ABC").build();
        
        // sending the request.
        final ResponseEntity<UserDTO> userResponse = this.restTemplate.postForEntity(UserController.API_ROOT, user, UserDTO.class);
        
        Assertions.assertEquals(HttpStatus.CREATED, userResponse.getStatusCode());
        Assertions.assertEquals(1, userRepository.count());
        Assertions.assertEquals(user.getEmailAddress(), userResponse.getBody().getEmailAddress());
        Assertions.assertEquals(user.getFirstName(), userResponse.getBody().getFirstName());
        Assertions.assertEquals(user.getLastName(), userResponse.getBody().getLastName());
        Assertions.assertNotNull(userResponse.getBody().getUserId());
        
        // Check the user in the database
        final UserEntity userSaved = this.userRepository.findByEmailAddress("blaise.pascal@gmail.com").get();
        log.info("The user saved is {}", userSaved);
        Assertions.assertEquals(user.getEmailAddress(), userSaved.getEmailAddress());
        Assertions.assertEquals(user.getFirstName(), userSaved.getFirstName());
        Assertions.assertEquals(user.getLastName(), userSaved.getLastName());
        Assertions.assertNotNull(userSaved.getId());
    }
    
    // -------------------------------------- Setters and Getters
    
}
