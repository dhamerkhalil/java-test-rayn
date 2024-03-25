package com.automata.testing.framework.user.utils;

import com.automata.testing.framework.algorithm.service.EncryptRotation13ServiceImpl;
import com.automata.testing.framework.algorithm.service.IEncryptionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgorithmUtils {

    @Bean
    public IEncryptionService encryptionService(){
        return new EncryptRotation13ServiceImpl();
    }
}
