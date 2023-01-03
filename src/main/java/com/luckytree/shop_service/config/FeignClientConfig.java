package com.luckytree.shop_service.config;

import feign.Logger;
import lombok.extern.java.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    /**
     *  feign logging level setting
     */
    @Bean
    Logger.Level fdignLoggerLever() {
        return Logger.Level.FULL;
    }

}
