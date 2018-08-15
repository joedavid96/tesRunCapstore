package com.capgemini.capstore.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {

	@Id
	private int orderId;
	@OneToOne 
	private Product product;
	@OneToOne
	private Customer customer;
	@OneToOne
	private Merchant merchant;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="transaction")
	private Transaction transaction;
	private Date deliveryDate;
	private Date orderDate;
	private String deliveryStatus;
	@OneToOne
	private Promo promo;
	private double orderAmount;
	
	//Constructors
	public Order(int orderId) {
		super();
		this.orderId = orderId;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, Product product, Customer customer, Merchant merchant, Transaction transaction,
			Date deliveryDate, Date orderDate, String deliveryStatus, Promo promo, double orderAmount) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.customer = customer;
		this.merchant = merchant;
		this.transaction = transaction;
		this.deliveryDate = deliveryDate;
		this.orderDate = orderDate;
		this.deliveryStatus = deliveryStatus;
		this.promo = promo;
		this.orderAmount = orderAmount;
	}
	
	//Getters and Setters
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public Promo getPromo() {
		return promo;
	}
	public void setPromo(Promo promo) {
		this.promo = promo;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}



}
