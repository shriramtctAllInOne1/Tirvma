/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/

package com.tivrma.config;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Loading property files
 * 
 * @author shriram
 *
 */
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "constant")
public class YAMLConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	String authenticationUrl;
	/**
	 * 
	 */
	String clientId;
	/**
	 * 
	 */
	String clientScret;
	/**
	 * 
	 */
	String resourceId;
	
	/**
	 * 
	 */
	String adminUrlPattern ;
	/**
	 * 
	 */
	String   userUrlPattern ;
	/**
	 * 
	 */
	String   adminRole;
	/**
	 * 
	 */
	String  userRole;
	

	public String getAdminUrlPattern() {
		return adminUrlPattern;
	}

	public void setAdminUrlPattern(String adminUrlPattern) {
		this.adminUrlPattern = adminUrlPattern;
	}

	public String getUserUrlPattern() {
		return userUrlPattern;
	}

	public void setUserUrlPattern(String userUrlPattern) {
		this.userUrlPattern = userUrlPattern;
	}

	public String getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	/**
	 * @return
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return
	 */
	public String getClientScret() {
		return clientScret;
	}

	/**
	 * @param clientScret
	 */
	public void setClientScret(String clientScret) {
		this.clientScret = clientScret;
	}

	/**
	 * @return
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * @param resourceId
	 */
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * @return
	 */
	public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	/**
	 * @param authenticationUrl
	 */
	public void setAuthenticationUrl(String authenticationUrl) {
		this.authenticationUrl = authenticationUrl;
	}


	
	
}
