package com.automata.testing.framework.user.model;
/*
 * Copyright: Copyright (c) Automata akt.io 2022-2024.
 * All rights reserved.
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Dependencies
 */
@Entity
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * The ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    /**
     * The user first name.
     */
    @NotBlank(message = "First name is required")
    private String firstName;
    
    /**
     * The user last name.
     */
    @NotBlank(message = "Last name is required")
    private String lastName;
    
    /**
     * The user email address.
     */
    @NotBlank(message = "Email address is required")
    @Email(message = "Invalid email address")
    private String emailAddress;
    
    /**
     * The user password.
     */
    @NotBlank(message = "Password is required")
    private String password;
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    // -------------------------------------- Setters and Getters
    
}