package com.automata.testing.framework.post;
/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Dependencies
 */

/**
 * Creating the Post Service Spring Boot application.
 *
 * @author GELIBERT
 */
@SpringBootApplication
@EntityScan
@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
public class PostServiceApi {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    public static void main(final String[] args) {
        SpringApplication.run(PostServiceApi.class, args);
    }
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    // -------------------------------------- Setters and Getters
    
}
