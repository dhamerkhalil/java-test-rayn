package com.automata.testing.framework.algorithm.service;

/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

/**
 * Dependencies
 */

/**
 * Basic Decryption Management Service Impl
 *
 * @author GELIBERT
 */
public class DecryptRotation13ServiceImpl implements IDecryptionService {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes

    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    /**
     * Storing the last character we handled.
     */
    private String CHAR_RESULT = null;

    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    // -------------------------------------- Protected methods
    // -------------------------------------- Public methods
    @Override
    public String decode(String input) {
        for (int i = 0; i <= input.toUpperCase().length(); i++) {
            if (i == 0) {
                continue;
            }
            char c = input.charAt(i - 1);
            char res = (char) ((c - 13));
            if (!Character.isAlphabetic(res)) {
                res = c;
            }
            if (CHAR_RESULT == null) {
                CHAR_RESULT = "";
            }
            CHAR_RESULT = CHAR_RESULT + res;
        }
        String res = CHAR_RESULT;
        CHAR_RESULT = null;
        return res;
    }
    
    // -------------------------------------- Setters and Getters
    
}
