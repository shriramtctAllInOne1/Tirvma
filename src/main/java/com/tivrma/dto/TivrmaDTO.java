/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.dto;

import java.io.Serializable;
import java.util.List;

public class TivrmaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	String symbolName;
	/**
	 * 
	 */
	List<String> expiryDate;
	/**
	 * 
	 */
	Integer peUp;

	/**
	 * 
	 */
	Integer peDown;
	/**
	 * 
	 */
	Integer ceUP;

	/**
	 * 
	 */
	Integer ceDown;
	/**
	 * 
	 */
	Integer stepSize;
	/**
	 * 
	 */
	Integer ltp;

	

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	

	public Integer getStepSize() {
		return stepSize;
	}

	public void setStepSize(Integer stepSize) {
		this.stepSize = stepSize;
	}

	public Integer getLtp() {
		return ltp;
	}

	public void setLtp(Integer ltp) {
		this.ltp = ltp;
	}

	public Integer getPeUp() {
		return peUp;
	}

	public void setPeUp(Integer peUp) {
		this.peUp = peUp;
	}

	public Integer getPeDown() {
		return peDown;
	}

	public void setPeDown(Integer peDown) {
		this.peDown = peDown;
	}

	public Integer getCeUP() {
		return ceUP;
	}

	public void setCeUP(Integer ceUP) {
		this.ceUP = ceUP;
	}

	public Integer getCeDown() {
		return ceDown;
	}

	public void setCeDown(Integer ceDown) {
		this.ceDown = ceDown;
	}

	public List<String> getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(List<String> expiryDate) {
		this.expiryDate = expiryDate;
	}

	

}
