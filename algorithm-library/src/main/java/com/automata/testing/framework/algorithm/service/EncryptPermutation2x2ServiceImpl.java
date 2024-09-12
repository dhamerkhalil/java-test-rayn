package com.automata.testing.framework.algorithm.service;


/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

/**
 * This is a very simple way to manage the encryption service.
 *
 * @author GELIBERT
 * @author SEGURA
 */
public class EncryptPermutation2x2ServiceImpl implements IEncryptionService {
    
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


    /**
     * Function to permute characters pairwise for encoding
     * @param input clear text
     * @return encoded text
     */
    @Override
    public String encode(final String input) {
        return new DecryptPermuation2x2ServiceImpl().decode(input);
    }
    
    
    // -------------------------------------- Setters and Getters
    
}
