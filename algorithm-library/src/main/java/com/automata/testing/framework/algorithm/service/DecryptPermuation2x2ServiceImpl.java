package com.automata.testing.framework.algorithm.service;

/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

/**
 * Basic Decryption Management Service Impl
 *
 * @author GELIBERT
 */
public class DecryptPermuation2x2ServiceImpl implements IDecryptionService {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes

    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes

    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    // -------------------------------------- Protected methods
    // -------------------------------------- Public methods

    /**
     * Function to permute characters pairwise for decoding
     * @param input encoded text
     * @return decoded text
     */
    @Override
    public String decode(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        return new String(chars);
    }
    
    // -------------------------------------- Setters and Getters
    
}
