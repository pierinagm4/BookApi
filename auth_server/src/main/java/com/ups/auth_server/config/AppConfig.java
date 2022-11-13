package com.ups.auth_server.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @LoadBalanced
    @Bean("restTemplateUser")
    public RestTemplate registerRestTemplates() {
        return new RestTemplate();
    }

}