package com.cognizant.springlearn.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("Inside configure(AuthenticationManagerBuilder)");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // ✅ FIX: use addFilterBefore (NOT addFilter)
        http.addFilterBefore(
                new JwtAuthorizationFilter(),
                org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter.class
        );
    }
}