package com.example.fmgatewayvcb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class AppConfig {
    @Value("${api.url}")
    private String apiUrl;

    public String getApiUrl() {
        return apiUrl;
    }
}
