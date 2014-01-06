package com.ejb.image.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Image")


public class Image implements Serializable{

	/**
	 * Create a serial UID version
	 */
	private static final long serialVersionUID = 12440L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ImageId", nullable = false)
	private Integer imageId;
	
	@Column(name="Name", nullable = false)
	@Basic(fetch = FetchType.LAZY)
	private String name;
	
	@Column(name="Description", nullable = true)
	private String description;
	
	@Column(name="Location", nullable = true)
	private String location;
	
	@Column(name="Settings", nullable = true)
	private String settings;
	
	@Column(name="CDate", nullable = true, insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date cDate;
	
	@Column(name="MDate", nullable = true, insertable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date mDate;
	
	@Column(name="CUser", nullable = true, insertable = false, updatable = false)
	private String cUser;
	
	@Column(name="MUser", nullable = true, insertable = false)
	private String mUser;
	
	public Image(){
		
	}
	
	public void setImageId(Integer imageId){
		this.imageId = imageId;
	}
	
	public Integer getImageId(){
		return this.imageId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public void setSettings(String settings){
		this.settings = settings;
	}
	
	public String getSettings(){
		return this.settings;
	}
	
	public void setCDate(Date cDate){
		this.cDate = cDate;
	}
	
	public Date getCDate(){
		return this.cDate;
	}
	
	public void setMDate(Date mDate){
		this.mDate = mDate;
	}
	
	public Date getMDate(){
		return this.mDate;
	}
	
	public void setCUser(String cUser){
		this.cUser = cUser;
	}
	
	public String getCUser(){
		return this.cUser;
	}
	
	public void setMUser(String mUser){
		this.mUser = mUser;
	}
	
	public String getMUser(){
		return this.mUser;
	}
}
