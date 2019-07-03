/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import com.tivrma.config.YAMLConfig;

/**
 * @author shriram
 *
 */
@Configuration
public class ResourceServerTokenStoreConfig {

	/**
	 * .YML properties file configuration
	 */
	@Autowired
	YAMLConfig config;

	/**
	 * Bean to verify the token
	 * 
	 * @return
	 */
	@Primary
	@Bean
	@Profile("!jwttoken")
	public ResourceServerTokenServices remoteTokenServices() {
		RemoteTokenServices tokenService = new RemoteTokenServices();
		tokenService.setCheckTokenEndpointUrl(config.getAuthenticationUrl());
		tokenService.setClientId(config.getClientId());
		tokenService.setClientSecret(config.getClientScret());
		return tokenService;
	}

	/**
	 * @return
	 */
	@Bean
	@Primary
	@Profile("jwttoken")
	public ResourceServerTokenServices jwtTokenServices() {
		DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
		defaultTokenServices.setTokenStore(tokenStore());
		return defaultTokenServices;
	}

	/**
	 * @return
	 */
	@Bean
	@Profile("jwttoken")
	public TokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}

	/**
	 * @return
	 */
	@Bean
	@Profile("jwttoken")
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey("123");
		return converter;
	}
}
