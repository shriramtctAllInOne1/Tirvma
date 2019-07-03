/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.mongoconfig;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;

/**
 * @author shriram
 *
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
	private static final Logger LOGGER = LoggerFactory.getLogger(MongoConfig.class);

	/**
	 * 
	 */
	@Autowired
	MongoSettingsProperties properties;

	/**
	 * setting up mongoOption client option
	 */
	@Override
	public MongoClient mongoClient() {
		MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
		builder.connectionsPerHost(properties.getMaxConnectionsPerHost());
		builder.minConnectionsPerHost(properties.getMinConnectionsPerHost());
		if (properties.getReplicaSet() != null) {
			builder.requiredReplicaSetName(properties.getReplicaSet());
		}
		builder.threadsAllowedToBlockForConnectionMultiplier(
				properties.getThreadsAllowedToBlockForConnectionMultiplier());
		builder.serverSelectionTimeout(properties.getServerSelectionTimeout());
		builder.maxWaitTime(properties.getMaxWaitTime());
		builder.maxConnectionIdleTime(properties.getMaxConnectionIdleTime());
		builder.maxConnectionLifeTime(properties.getMaxConnectionLifeTime());
		builder.connectTimeout(properties.getConnectTimeout());
		builder.socketTimeout(properties.getSocketTimeout());
		builder.sslEnabled(properties.getSslEnabled());
		builder.sslInvalidHostNameAllowed(properties.getSslInvalidHostNameAllowed());
		builder.alwaysUseMBeans(properties.getAlwaysUseMBeans());
		builder.heartbeatFrequency(properties.getHeartbeatFrequency());
		builder.minHeartbeatFrequency(properties.getMinHeartbeatFrequency());
		builder.heartbeatConnectTimeout(properties.getHeartbeatConnectTimeout());
		builder.heartbeatSocketTimeout(properties.getHeartbeatSocketTimeout());
		builder.localThreshold(properties.getLocalThreshold());
		MongoClientOptions mongoClientOptions = builder.build();
		List<ServerAddress> serverAddresses = new ArrayList<ServerAddress>();
		
			ServerAddress serverAddress = new ServerAddress(properties.getHost(), properties.getPort());
			serverAddresses.add(serverAddress);
		
		/*
		 * MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/Stock",
		 * builder); MongoClient mongoClient = new MongoClient(uri);
		 */
		// MongoClient mongoClient = new MongoClient(serverAddresses, mongoCredential,
		// mongoClientOptions);
		// Create a non-authenticated client
		MongoClient mongoClient = new MongoClient(serverAddresses, mongoClientOptions);
		return mongoClient;
	}

	/**
	 * get database name
	 */
	@Override
	protected String getDatabaseName() {
		return properties.getDatabase();
	}

	/*
	 * @Bean public MongoDbFactory mongoDbFactory() { return new
	 * SimpleMongoDbFactory(mongoClient(), properties.getDatabase()); }
	 * 
	 * @Bean public MongoTemplate mongoTemplate() throws Exception { MongoTemplate
	 * mongoTemplate = new MongoTemplate(mongoDbFactory()); return mongoTemplate;
	 * 
	 * }
	 */
	
	/**
	 * 
	 */
	@PostConstruct
	public void createCollection() {
		LOGGER.debug("Entering MongoConfig.class createCollection()");
		try {
		for(String collection:properties.getCollectionsList()) {
			if(!mongoTemplate().collectionExists(collection))
			  mongoTemplate().createCollection(collection);
			}
		} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
