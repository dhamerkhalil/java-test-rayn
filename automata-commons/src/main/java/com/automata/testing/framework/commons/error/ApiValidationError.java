package com.automata.testing.framework.commons.error;

/*
 * Copyright: Copyright (c) Automata akt.io 2024.
 * All rights reserved.
 */

/**
 * Dependencies
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Validation Error.
 *
 * @author rgelibert
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class ApiValidationError implements IApiSubError {
    
    // -------------------------------------- Private attributes
    
    /**
     * Object Error.
     */
    private String object;
    
    /**
     * Field error.
     */
    private String field;
    
    /**
     * Value rejected.
     */
    private Object rejectedValue;
    
    /**
     * Message.
     */
    private String message;
    
}