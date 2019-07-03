package com.tivrma.mongoconfig;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Class to load mongodb property from property file
 * 
 * @author Shriram
 *
 */

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoSettingsProperties {

	/**
	 * 
	 */
	private String host;
	
	/**
	 * 
	 */
	private int port;
	/**
	 * 
	 */
	private String replicaSet;
	/**
	 * 
	 */
	private String database;
	/**
	 * 
	 */
	private String username;
	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private Integer minConnectionsPerHost = 0;
	/**
	 * 
	 */
	private Integer maxConnectionsPerHost = 100;
	/**
	 * 
	 */
	private Integer threadsAllowedToBlockForConnectionMultiplier = 5;
	/**
	 * 
	 */
	private Integer serverSelectionTimeout = 30000;
	/**
	 * 
	 */
	private Integer maxWaitTime = 120000;
	/**
	 * 
	 */
	private Integer maxConnectionIdleTime = 0;
	/**
	 * 
	 */
	private Integer maxConnectionLifeTime = 0;
	/**
	 * 
	 */
	private Integer connectTimeout = 10000;
	/**
	 * 
	 */
	private Integer socketTimeout = 0;
	/**
	 * 
	 */
	private Boolean socketKeepAlive = false;
	/**
	 * 
	 */
	private Boolean sslEnabled = false;
	/**
	 * 
	 */
	private Boolean sslInvalidHostNameAllowed = false;
	/**
	 * 
	 */
	private Boolean alwaysUseMBeans = false;
	/**
	 * 
	 */
	private Integer heartbeatConnectTimeout = 20000;
	/**
	 * 
	 */
	private Integer heartbeatSocketTimeout = 20000;
	/**
	 * 
	 */
	private Integer minHeartbeatFrequency = 500;
	/**
	 * 
	 */
	private Integer heartbeatFrequency = 10000;
	/**
	 * 
	 */
	private Integer localThreshold = 15;
	/**
	 * 
	 */
	private String authenticationDatabase;
	
	/**
	 * 
	 */
	private List<String>collectionsList;

	/**
	 * @return
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host
	 */
	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return
	 */
	public String getReplicaSet() {
		return replicaSet;
	}

	/**
	 * @param replicaSet
	 */
	public void setReplicaSet(String replicaSet) {
		this.replicaSet = replicaSet;
	}

	/**
	 * @return
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * @param database
	 */
	public void setDatabase(String database) {
		this.database = database;
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public Integer getMinConnectionsPerHost() {
		return minConnectionsPerHost;
	}

	/**
	 * @param minConnectionsPerHost
	 */
	public void setMinConnectionsPerHost(Integer minConnectionsPerHost) {
		this.minConnectionsPerHost = minConnectionsPerHost;
	}

	/**
	 * @return
	 */
	public Integer getMaxConnectionsPerHost() {
		return maxConnectionsPerHost;
	}

	/**
	 * @param maxConnectionsPerHost
	 */
	public void setMaxConnectionsPerHost(Integer maxConnectionsPerHost) {
		this.maxConnectionsPerHost = maxConnectionsPerHost;
	}

	/**
	 * @return
	 */
	public Integer getThreadsAllowedToBlockForConnectionMultiplier() {
		return threadsAllowedToBlockForConnectionMultiplier;
	}

	/**
	 * @param threadsAllowedToBlockForConnectionMultiplier
	 */
	public void setThreadsAllowedToBlockForConnectionMultiplier(Integer threadsAllowedToBlockForConnectionMultiplier) {
		this.threadsAllowedToBlockForConnectionMultiplier = threadsAllowedToBlockForConnectionMultiplier;
	}

	/**
	 * @return
	 */
	public Integer getServerSelectionTimeout() {
		return serverSelectionTimeout;
	}

	/**
	 * @param serverSelectionTimeout
	 */
	public void setServerSelectionTimeout(Integer serverSelectionTimeout) {
		this.serverSelectionTimeout = serverSelectionTimeout;
	}

	/**
	 * @return
	 */
	public Integer getMaxWaitTime() {
		return maxWaitTime;
	}

	/**
	 * @param maxWaitTime
	 */
	public void setMaxWaitTime(Integer maxWaitTime) {
		this.maxWaitTime = maxWaitTime;
	}

	/**
	 * @return
	 */
	public Integer getMaxConnectionIdleTime() {
		return maxConnectionIdleTime;
	}

	/**
	 * @param maxConnectionIdleTime
	 */
	public void setMaxConnectionIdleTime(Integer maxConnectionIdleTime) {
		this.maxConnectionIdleTime = maxConnectionIdleTime;
	}

	/**
	 * @return
	 */
	public Integer getMaxConnectionLifeTime() {
		return maxConnectionLifeTime;
	}

	/**
	 * @param maxConnectionLifeTime
	 */
	public void setMaxConnectionLifeTime(Integer maxConnectionLifeTime) {
		this.maxConnectionLifeTime = maxConnectionLifeTime;
	}

	/**
	 * @return
	 */
	public Integer getConnectTimeout() {
		return connectTimeout;
	}

	/**
	 * @param connectTimeout
	 */
	public void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	/**
	 * @return
	 */
	public Integer getSocketTimeout() {
		return socketTimeout;
	}

	/**
	 * @param socketTimeout
	 */
	public void setSocketTimeout(Integer socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	/**
	 * @return
	 */
	public Boolean getSocketKeepAlive() {
		return socketKeepAlive;
	}

	/**
	 * @param socketKeepAlive
	 */
	public void setSocketKeepAlive(Boolean socketKeepAlive) {
		this.socketKeepAlive = socketKeepAlive;
	}

	/**
	 * @return
	 */
	public Boolean getSslEnabled() {
		return sslEnabled;
	}

	/**
	 * @param sslEnabled
	 */
	public void setSslEnabled(Boolean sslEnabled) {
		this.sslEnabled = sslEnabled;
	}

	/**
	 * @return
	 */
	public Boolean getSslInvalidHostNameAllowed() {
		return sslInvalidHostNameAllowed;
	}

	/**
	 * @param sslInvalidHostNameAllowed
	 */
	public void setSslInvalidHostNameAllowed(Boolean sslInvalidHostNameAllowed) {
		this.sslInvalidHostNameAllowed = sslInvalidHostNameAllowed;
	}

	/**
	 * @return
	 */
	public Boolean getAlwaysUseMBeans() {
		return alwaysUseMBeans;
	}

	/**
	 * @param alwaysUseMBeans
	 */
	public void setAlwaysUseMBeans(Boolean alwaysUseMBeans) {
		this.alwaysUseMBeans = alwaysUseMBeans;
	}

	/**
	 * @return
	 */
	public Integer getHeartbeatConnectTimeout() {
		return heartbeatConnectTimeout;
	}

	/**
	 * @param heartbeatConnectTimeout
	 */
	public void setHeartbeatConnectTimeout(Integer heartbeatConnectTimeout) {
		this.heartbeatConnectTimeout = heartbeatConnectTimeout;
	}

	/**
	 * @return
	 */
	public Integer getHeartbeatSocketTimeout() {
		return heartbeatSocketTimeout;
	}

	/**
	 * @param heartbeatSocketTimeout
	 */
	public void setHeartbeatSocketTimeout(Integer heartbeatSocketTimeout) {
		this.heartbeatSocketTimeout = heartbeatSocketTimeout;
	}

	/**
	 * @return
	 */
	public Integer getMinHeartbeatFrequency() {
		return minHeartbeatFrequency;
	}

	/**
	 * @param minHeartbeatFrequency
	 */
	public void setMinHeartbeatFrequency(Integer minHeartbeatFrequency) {
		this.minHeartbeatFrequency = minHeartbeatFrequency;
	}

	/**
	 * @return
	 */
	public Integer getHeartbeatFrequency() {
		return heartbeatFrequency;
	}

	/**
	 * @param heartbeatFrequency
	 */
	public void setHeartbeatFrequency(Integer heartbeatFrequency) {
		this.heartbeatFrequency = heartbeatFrequency;
	}

	/**
	 * @return
	 */
	public Integer getLocalThreshold() {
		return localThreshold;
	}

	/**
	 * @param localThreshold
	 */
	public void setLocalThreshold(Integer localThreshold) {
		this.localThreshold = localThreshold;
	}

	/**
	 * @return
	 */
	public String getAuthenticationDatabase() {
		return authenticationDatabase;
	}

	/**
	 * @param authenticationDatabase
	 */
	public void setAuthenticationDatabase(String authenticationDatabase) {
		this.authenticationDatabase = authenticationDatabase;
	}

	public List<String> getCollectionsList() {
		return collectionsList;
	}

	public void setCollectionsList(List<String> collectionsList) {
		this.collectionsList = collectionsList;
	}

	
}