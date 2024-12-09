package com.dbms.bloodbank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/", "index", "/login", "/register").permitAll()  // Allow login and register for all users
                        .requestMatchers("/inventory").authenticated()
                        .anyRequest().authenticated()  // Ensure all other requests require authentication
                )
                .formLogin(form -> form
                        .loginPage("/login")  // Custom login page
                        .defaultSuccessUrl("/home", true)  // Redirect to /home after successful login
                        .permitAll()
                )
                .logout(logout -> logout.permitAll())
                .build();
    }
}
