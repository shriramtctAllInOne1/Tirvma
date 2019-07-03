/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.restClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tivrma.config.ErrorCodeMsgConstant;
import com.tivrma.config.YAMLConfig;
import com.tivrma.util.CommonUtility;

/**
 * @author shriram
 *
 */

@Service
public class RestClient {

	/**
	 * 
	 */
	@Autowired
	RestTemplate restTemplate;

	/**
	 * 
	 */
	@Autowired
	YAMLConfig config;
	
	/**
	 * 
	 */
	@Autowired
	CommonUtility commonUtility;

	/**
	 * 
	 */
	@Autowired
	ErrorCodeMsgConstant errormsgConfig;
	/**
	 * 
	 */
	private final static int MAX_THREAD = 20;

	/**
	 * Logger Object
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(RestClient.class);

	/**
	 * @param finaloaitmMap
	 */
	
}
