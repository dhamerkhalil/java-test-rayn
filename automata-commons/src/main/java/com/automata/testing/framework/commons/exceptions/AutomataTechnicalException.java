package com.automata.testing.framework.commons.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

/**
 * Dependencies
 */

/**
 * Parent for all Automata Technical Exceptions.
 *
 * @author GELIBERT
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AutomataTechnicalException extends RuntimeException {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- Private static attributes
    
    /**
     * Serial Version ID.
     */
    private static final long serialVersionUID = -374435710023782166L;
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * The error context message.
     */
    private String contextMessage;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    /**
     * Default Constructor.
     */
    public AutomataTechnicalException(String contextMessage, String message, Throwable cause) {
        super(message, cause);
        this.contextMessage = contextMessage;
    }
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    // -------------------------------------- Setters and Getters
    
}
