package com.automata.testing.framework.algorithm.service;
/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Dependencies
 */

/**
 * Unit test for algorithms.
 *
 * @author GELIBERT
 * @author SEGURA
 */
class EncryptionManagementTest {
    
    // -------------------------------------- Inner classes
    
    // -------------------------------------- public static attributes
    
    // -------------------------------------- private static attributes
    
    // -------------------------------------- private attributes
    
    // -------------------------------------- Private attributes
    
    /**
     * Encryption service to use.
     */
    private final IEncryptionService encryptionService = new EncryptRotation13ServiceImpl();
    
    /**
     * Decryption service to use.
     */
    private final IDecryptionService decryptionService = new DecryptRotation13ServiceImpl();
    
    // -------------------------------------- public attributes
    
    // -------------------------------------- Constructor
    
    // -------------------------------------- Public static methods
    
    // -------------------------------------- Private static methods
    
    // -------------------------------------- Private methods
    
    // -------------------------------------- Protected methods
    
    // -------------------------------------- Public methods
    
    /**
     * Testing the ROT 13 Algorithm.
     */
    @Test
    public void iDontKnowTest() {
        
        // Testing with data ABC, that should be changed in NOP
        String res = encryptionService.encode("ABC");
        
        Assertions.assertEquals("NOP", res);
        
        res = encryptionService.encode("XYZ");
        Assertions.assertEquals("efg", res);
        
    }
    
    /**
     * Testing Synchronous encoding and decoding.
     */
    @Test
    public void iDontKnowTest2() {
        
        // Testing the decoding algorithm.
        String toTest = RandomStringUtils.randomAlphabetic(30).toUpperCase();
        Assertions.assertEquals(toTest, decryptionService.decode(encryptionService.encode(toTest)));
    }
    
    // -------------------------------------- Setters and Getters
    
}
