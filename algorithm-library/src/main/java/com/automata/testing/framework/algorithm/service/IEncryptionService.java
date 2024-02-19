package com.automata.testing.framework.algorithm.service;
/*
 * Copyright: Copyright (c) Automata akt.io 2021-2024.
 * All rights reserved.
 */

/**
 * Dependencies
 */

/**
 * This interface describe the multiple algorithms we have to encrypt some
 * datas.
 *
 * @author GELIBERT
 */
public interface IEncryptionService {
    
    // -------------------------------------- Public methods
    
    /**
     * Encode an input depending on the algorithm we want to use.
     *
     * @param input the input to encrypt
     * @return the result of the encryption.
     */
    String encode(String input);
    
}
