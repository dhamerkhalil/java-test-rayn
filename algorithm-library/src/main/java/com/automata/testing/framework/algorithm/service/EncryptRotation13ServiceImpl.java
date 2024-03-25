package com.automata.testing.framework.algorithm.service;


/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

/**
 * Dependencies
 */

/**
 * This is a very simple way to manage the encryption service.
 *
 * @author GELIBERT
 * @author SEGURA
 */
public class EncryptRotation13ServiceImpl implements IEncryptionService {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- Private attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    
    @Override
    public String encode(final String input) {
        if(input == null) throw new RuntimeException("Error empty input not allowed") ;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= input.toUpperCase().length(); i++) {
            if (i == 0) {
                continue;
            }
            char c = input.charAt(i - 1);
            char res = c;
            if (Character.isAlphabetic(c)) {
                res = (char) ((c + 13));
            }
            result.append(res);
        }
        return result.toString();
    }
    
    
    // -------------------------------------- Setters and Getters
    
}
