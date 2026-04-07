package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {

    // ✅ Define Users
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withUsername("Lingeshwar")
                .password("Lingesh")
                .roles("admin_role")
                .build();

        UserDetails user = User.withUsername("Poojitha")
                .password("Poojitha")
                .roles("student_role")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    // ✅ Security Configuration
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable()) // disable for testing APIs
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/delete").hasRole("admin_role")
                .anyRequest().authenticated()
            )
            .httpBasic(); // for Swagger / Postman

        return http.build();
    }

    // ✅ Password Encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance(); // only for testing
    }
}