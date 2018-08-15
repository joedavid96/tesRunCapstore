package com.capgemini.capstore.beans;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Inventory {

	@OneToOne
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
