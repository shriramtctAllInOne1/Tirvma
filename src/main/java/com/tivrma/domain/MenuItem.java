package com.tivrma.domain;

import java.io.Serializable;

public class MenuItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String itemId;
	private Double itemPrice;
	private Long quantiry;
	private Long subTotal;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Long getQuantiry() {
		return quantiry;
	}

	public void setQuantiry(Long quantiry) {
		this.quantiry = quantiry;
	}

	public Long getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Long subTotal) {
		this.subTotal = subTotal;
	}

}
