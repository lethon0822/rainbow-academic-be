package com.rainbowuniv.academicmenagmentbe.common.config;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

// SecurityConfig.java
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable());
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.GET,  "/api/schedule/**").permitAll()
                .requestMatchers(HttpMethod.POST, "/api/schedule/**").permitAll()
                .requestMatchers(HttpMethod.PUT,  "/api/schedule/**").permitAll()
                .requestMatchers(HttpMethod.DELETE,"/api/schedule/**").permitAll()
                .anyRequest().permitAll()
        );
        return http.build();
    }
}