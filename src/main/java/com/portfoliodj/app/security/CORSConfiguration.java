package com.portfoliodj.app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/customers/register") 
            .allowedOrigins("https://tetaseshinfos.vercel.app/") 
            .allowedMethods("POST", "OPTIONS") 
            .allowedHeaders("*") 
            .allowCredentials(true) 
            .maxAge(3600); 
    }
}
