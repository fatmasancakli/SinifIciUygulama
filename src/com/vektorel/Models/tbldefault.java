package com.vektorel.Models;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
public class tbldefault {
	private long id ;
	private String ad ;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
}
