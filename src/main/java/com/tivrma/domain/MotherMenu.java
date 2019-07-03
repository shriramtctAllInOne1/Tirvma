package com.tivrma.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "MotherMenu")
public class MotherMenu implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	private Integer menuId;
	
	
	private Integer motherId;
	
	
	
	
	
	private Date dateCreated;
	
	
	private Date dateUpdated;
	
	
	
	private String status;
	
	
	private String noOfOrdersReceived;
	
	
	private BigDecimal latitude;
	
	
	private BigDecimal longitude;
	
	
	private Integer noOfLikes;
	
	
	private String locality;
	

	private String city;
	
	
	private String pincode;
	
	
	private String image1;
	

	private String image2;
	
	
	private String image3;
	
	public MotherMenu() {
		
	}

	public Integer getMenu_Id() {
		return menuId;
	}

	public void setMenu_Id(Integer menu_Id) {
		this.menuId = menu_Id;
	}

	public Integer getMotherid_ref() {
		return motherId;
	}

	public void setMotherid_ref(Integer motherid_ref) {
		this.motherId = motherid_ref;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNoOfOrdersReceived() {
		return noOfOrdersReceived;
	}

	public void setNoOfOrdersReceived(String noOfOrdersReceived) {
		this.noOfOrdersReceived = noOfOrdersReceived;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public Integer getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(Integer noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}
	
}
