package com.jan1ooo.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {

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
