package com.client.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientCongiguration {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
