/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.domain;

import java.io.Serializable;
import java.util.Map;

/**
 * Pojo to create mongo-collection in mongodb
 * 
 * @author shriram
 *
 */
public class Dbcollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public String dbName;
	/**
	 * 
	 */
	public Map<String, String> collectionNames;

	/**
	 * @return
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * @param dbName
	 */
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	/**
	 * @return
	 */
	public Map<String, String> getCollectionNames() {
		return collectionNames;
	}

	/**
	 * @param collectionNameMap
	 */
	public void setCollectionNames(Map<String, String> collectionNames) {
		this.collectionNames = collectionNames;
	}

}
