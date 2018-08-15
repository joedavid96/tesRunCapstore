package com.capgemini.capstore.beans;

import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Merchant")
public class Merchant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int merchantId;
	private String merhantName;
	private String merchantEmail;
	private String mobileNo;
	@Embedded
	private Address merchantAddress;
	@Embedded
	private Discount merchantDiscount;
	@Embedded
	private Inventory merchantInventory;
	private double merchantRevPercent;
	private Date dateOfReg;
	private Date dateOfDel;

	//Constructors
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Merchant(int merchantId) {
		super();
		this.merchantId = merchantId;
	}

	public Merchant(int merchantId, String merhantName, String merchantEmail, String mobileNo, Address merchantAddress,
			Discount merchantDiscount, Inventory merchantInventory, double merchantRevPercent, Date dateOfReg,
			Date dateOfDel) {
		super();
		this.merchantId = merchantId;
		this.merhantName = merhantName;
		this.merchantEmail = merchantEmail;
		this.mobileNo = mobileNo;
		this.merchantAddress = merchantAddress;
		this.merchantDiscount = merchantDiscount;
		this.merchantInventory = merchantInventory;
		this.merchantRevPercent = merchantRevPercent;
		this.dateOfReg = dateOfReg;
		this.dateOfDel = dateOfDel;
	}

	//Getters and Setters
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerhantName() {
		return merhantName;
	}
	public void setMerhantName(String merhantName) {
		this.merhantName = merhantName;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getMerchantAddress() {
		return merchantAddress;
	}
	public void setMerchantAddress(Address merchantAddress) {
		this.merchantAddress = merchantAddress;
	}
	public Discount getMerchantDiscount() {
		return merchantDiscount;
	}
	public void setMerchantDiscount(Discount merchantDiscount) {
		this.merchantDiscount = merchantDiscount;
	}
	public Inventory getMerchantInventory() {
		return merchantInventory;
	}
	public void setMerchantInventory(Inventory merchantInventory) {
		this.merchantInventory = merchantInventory;
	}
	public double getMerchantRevPercent() {
		return merchantRevPercent;
	}
	public void setMerchantRevPercent(double merchantRevPercent) {
		this.merchantRevPercent = merchantRevPercent;
	}
	public Date getDateOfReg() {
		return dateOfReg;
	}
	public void setDateOfReg(Date dateOfReg) {
		this.dateOfReg = dateOfReg;
	}
	public Date getDateOfDel() {
		return dateOfDel;
	}
	public void setDateOfDel(Date dateOfDel) {
		this.dateOfDel = dateOfDel;
	}
}
