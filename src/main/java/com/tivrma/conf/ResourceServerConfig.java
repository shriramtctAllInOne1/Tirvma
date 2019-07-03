/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/

package com.tivrma.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

import com.tivrma.config.YAMLConfig;

/**
 * @author shriram
 *
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {


    /**
     * Token service
     */
    @Autowired 
    private ResourceServerTokenServices tokenServices;
    
    /**
     *  .yml configuration files
     */
    @Autowired 
    YAMLConfig config;

    /**
     * oauth2 ResourceServer Configuration 
     * 
     * @param resources
     * @throws Exception
     */
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(config.getResourceId()).tokenServices(tokenServices);
    }

    /**
     * Spring Security configuation
     * 
     * @param http
     * @throws Exception
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	 http
         .authorizeRequests()
         .antMatchers(config.getAdminUrlPattern()).hasAuthority(config.getAdminRole())
         .antMatchers(config.getUserUrlPattern()).hasAuthority(config.getUserRole())
         .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        
               
    }
}
