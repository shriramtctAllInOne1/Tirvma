package com.tivrma.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author shriram
 *
 */
@Document(collection = "MotherRating")
public class MotherRating implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	String ratingId;
	
	/**
	 * 
	 */
	private String motherId;
	
	/**
	 * 
	 */
	private String motherRating;

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
	public String getMotherRating() {
		return motherRating;
	}

	/**
	 * @param motherRating
	 */
	public void setMotherRating(String motherRating) {
		this.motherRating = motherRating;
	}

	/**
	 * @return
	 */
	public String getRatingId() {
		return ratingId;
	}

	/**
	 * @param ratingId
	 */
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	

}
