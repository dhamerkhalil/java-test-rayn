package com.automata.testing.framework.commons.error;

/*
 * Copyright: Copyright (c) Automata akt.io 2024.
 * All rights reserved.
 */

import com.automata.testing.framework.commons.exceptions.AutomataBusinessException;
import com.automata.testing.framework.commons.exceptions.AutomataTechnicalException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.AccessDeniedException;

/**
 * Common REST exception handler for APIs.
 *
 * @author SEGURA
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
@Slf4j
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- Private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    /**
     * Building Response Entity.
     *
     * @param apiError error to print
     * @return the new entity.
     */
    private ResponseEntity<Object> buildResponseEntity(final ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
    
    // -------------------------------------- Protected methods
    
    /**
     * Handle Access Denied Exception
     *
     * @param ex      exception
     * @param request request
     * @return the object
     */
    @ExceptionHandler(value = {AccessDeniedException.class})
    protected ResponseEntity<Object> handleAccessDenied(final AccessDeniedException ex, final WebRequest request) {
        log.warn("Handling denied error : {}", ex.getMessage());
        return this.handleExceptionInternal(ex, new ApiError(HttpStatus.UNAUTHORIZED), new HttpHeaders(),
                HttpStatus.UNAUTHORIZED, request);
    }
    
    /**
     * Handle Business Exceptions
     *
     * @param ex      exception
     * @param request request
     * @return the object
     */
    @ExceptionHandler(value = {AutomataBusinessException.class})
    protected ResponseEntity<Object> handleBusinessException(final AutomataBusinessException ex, final WebRequest request) {
        log.warn("Handling error : ", ex);
        return this.handleExceptionInternal(ex,
                ApiError.builder().detailedMessage(ex.getLocalizedMessage()).errorCode(ex.getErrorCode())
                        .message(ex.getMessage()).status(HttpStatus.BAD_REQUEST).build(),
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
    
    /**
     * Handle Technical Exceptions
     *
     * @param ex      exception
     * @param request request
     * @return the object
     */
    @ExceptionHandler(value = {AutomataTechnicalException.class})
    protected ResponseEntity<Object> handleTechnicalException(final AutomataTechnicalException ex,
                                                              final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        log.warn("Handling error : {}", ex.getMessage());
        return this.handleExceptionInternal(ex,
                ApiError.builder().detailedMessage(ex.getLocalizedMessage()).message(ex.getMessage())
                        .status(HttpStatus.INTERNAL_SERVER_ERROR).build(),
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
    
    
    // -------------------------------------- Public methods
    
    // -------------------------------------- Setters and Getters
    
}
