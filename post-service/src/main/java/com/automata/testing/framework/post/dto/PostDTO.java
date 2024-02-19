package com.automata.testing.framework.post.dto;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dependencies
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDTO {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
// -------------------------------------- Private attributes
    /**
     * The post Id.
     */
    private Integer id;
    
    /**
     * The post content.
     */
    private String content;
    
    /**
     * The linked user for the post.
     */
    private UserDTO user;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    // -------------------------------------- Setters and Getters
    
}
