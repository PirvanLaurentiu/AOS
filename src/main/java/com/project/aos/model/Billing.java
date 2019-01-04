package com.project.aos.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name="billing")
@EntityListeners(AuditingEntityListener.class)

public class Billing {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBilling;
	
	@NotBlank
	private int price;
	
	@NotBlank
	private int discount;
	
	@NotBlank
	private int idProduct;

	public int getIdBilling() {
		return idBilling;
	}

	public void setIdBilling(int idBilling) {
		this.idBilling = idBilling;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
}
