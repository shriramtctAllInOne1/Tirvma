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
	Integer id;
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
	private List<MenuItem> menuItemList;

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
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	/**
	 * @param menuItemList
	 */
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	/**
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

}
