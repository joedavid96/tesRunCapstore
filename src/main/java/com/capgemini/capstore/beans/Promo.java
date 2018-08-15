package com.capgemini.capstore.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Promo")
public class Promo {

	@Id
	private int promoId;
	private String promoType;
	private String promoName;
	private String promoDesc;

	//Constructors
	public Promo() {
		super();
	}


	public Promo(int promoId) {
		super();
		this.promoId = promoId;
	}


	public Promo(int promoId, String promoType, String promoName, String promoDesc) {
		super();
		this.promoId = promoId;
		this.promoType = promoType;
		this.promoName = promoName;
		this.promoDesc = promoDesc;
	}

	
	//Getters and Setters
	public int getPromoId() {
		return promoId;
	}


	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}


	public String getPromoType() {
		return promoType;
	}


	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}


	public String getPromoName() {
		return promoName;
	}


	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}


	public String getPromoDesc() {
		return promoDesc;
	}


	public void setPromoDesc(String promoDesc) {
		this.promoDesc = promoDesc;
	}








}
