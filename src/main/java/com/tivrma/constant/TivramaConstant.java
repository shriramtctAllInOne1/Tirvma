/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.constant;

public class TivramaConstant {

	/**
	 * Determines the timeout in milliseconds until a connection is established.
	 */
	public static final int CONNECT_TIMEOUT = 60000;

	/**
	 * The timeout when requesting a connection from the connection manager.
	 */
	public static final int REQUEST_TIMEOUT = 60000;

	/**
	 * The timeout for waiting for data
	 */
	public static final int SOCKET_TIMEOUT = 60000;

	/**
	 * 
	 */
	public static final int MAX_TOTAL_CONNECTIONS = 100;
	/**
	 * 
	 */
	public static final int DEFAULT_KEEP_ALIVE_TIME_MILLIS = 60000;
	/**
	 * 
	 */
	public static final int CLOSE_IDLE_CONNECTION_WAIT_TIME_SECS = 60;


	public static final String OAUTH = "hasAuthority('ROLE_ADMIN')";

	/**
	 * authority
	 */
	public static final String OAUTH_ROLE = "hasAuthority('ROLE_USER')";
	/**
	 * /** content type
	 */
	public static final String CONTENTTYPE = "application/json";

	public static final String ISTURE = "true";

}
