package com.tivrma.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//https://dzone.com/articles/introduction-to-json-with-java
@Document(collection = "CartItem")
public class CartItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	String id;
	/**
	 * 
	 */
	private String motherId;
	/**
	 * 
	 */
	private String userId;
	/**
	 * 
	 */
	private List<MenuItem> menuitems;

	/**
	 * @return
	 */
	public String getMotherId() {
		return motherId;
	}

	/**
	 * @param motherId
	 */
	public void setMotherId(String motherId) {
		this.motherId = motherId;
	}

	/**
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public List<MenuItem> getMenuitems() {
		return menuitems;
	}

	/**
	 * @param menuitems
	 */
	public void setMenuitems(List<MenuItem> menuitems) {
		this.menuitems = menuitems;
	}

}
