package com.automata.testing.framework.commons.error;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Model representation of error in this API.
 *
 * @author GELIBERT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiError {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * Http Status.
     */
    private HttpStatus status;
    
    /**
     * Date of the error.
     */
    @Builder.Default
    private final ZonedDateTime dateTime = ZonedDateTime.now();
    
    /**
     * Message Error.
     */
    private String message;
    
    /**
     * Error code.
     */
    private String errorCode;
    
    /**
     * detailed message.
     */
    private String detailedMessage;
    
    /**
     * SubErrors (possible nesting).
     */
    private List<ApiValidationError> subErrors;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    /**
     * Constructor.
     *
     * @param httpStatus the http status
     */
    public ApiError(final HttpStatus httpStatus) {
        this();
        this.status = httpStatus;
    }
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    // -------------------------------------- Setters and Getters
    
}
