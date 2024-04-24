package com.shopping.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: CartInfo
 *
 */
@Entity
public class CartInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;
	@Column(name = "Product_Name",nullable = false,length = 30)
	private String productName;
	@Column(name = "Product_Price",nullable = false)
	private double productPrice;
	@Column(name = "Product_Brand",nullable = false)
	private String productBrand;
	private Integer customerId;
	private static final long serialVersionUID = 1L;

	public CartInfo() {
	}   
	
	public CartInfo(String productName, double productPrice, String productBrand, Integer customerId) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.customerId = customerId;
	}

	public Integer getCartId() {
		return this.cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}   
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}   
	public double getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}   
	public String getProductBrand() {
		return this.productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}   
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "CartInfo [cartId=" + cartId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productBrand=" + productBrand + ", customerId=" + customerId + "]";
	}
   
}
