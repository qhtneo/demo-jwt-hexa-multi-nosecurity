package com.example.demo.auth.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class EncoderConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder() {
            // ▼ Subclass of BCryptPasswordEncoder
            @Override
            public String encode(CharSequence rawPassword) {
                return STR."{bcrypt}\{super.encode(rawPassword)}";
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                // (inclusive)~(exclusive)
                encodedPassword = encodedPassword.substring("{bcrypt}".length());
                return super.matches(rawPassword, encodedPassword);
            }
        };
    }
}