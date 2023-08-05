package com.jan1ooo.hroauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

    @Bean
    JwtAccessTokenConverter accessTokenConverter() {
    	JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
    	tokenConverter.setSigningKey("12345678");
    	return tokenConverter;
    }
    
    @Bean
    JwtTokenStore tokenStore() {
    	return new JwtTokenStore(accessTokenConverter());
    }
    
}
