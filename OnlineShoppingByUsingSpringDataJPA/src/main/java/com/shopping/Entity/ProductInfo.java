package com.shopping.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: ProductInfo
 *
 */
@Entity
public class ProductInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prodId;
	@Column(name = "Product_Name",nullable = false,length = 30)
	private String prodName;
	@Column(name = "Product_Brand",nullable = false,length = 30)
	private String prodBrand;
	@Column(name = "Product_Quantity",nullable = false)
	private int prodQuantity;
	@Column(name = "Product_Expiry_Date",nullable = false)
	private Date prodExpiryDate;
	@Column(name = "Product_Review",nullable = false,length = 30)
	private String prodReview;
	@Column(name = "Product_Price",nullable = false)
	private double prodPrice;
	private static final long serialVersionUID = 1L;

	public ProductInfo() {
		super();
	}
	
	public ProductInfo(int prodId, String prodName, String prodBrand, int prodQuantity, Date prodExpiryDate,
			String prodReview, double prodPrice) {
		super();
		this.setProdId(prodId);
		this.setProdName(prodName);
		this.setProdBrand(prodBrand);
		this.setProdQuantity(prodQuantity);
		this.setProdExpiryDate(prodExpiryDate);
		this.setProdReview(prodReview);
		this.setProdPrice(prodPrice);
	}

	public Integer getProdId() {
		return this.prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdBrand() {
		return this.prodBrand;
	}

	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}

	public int getProdQuantity() {
		return this.prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public Date getProdExpiryDate() {
		return prodExpiryDate;
	}

	public void setProdExpiryDate(Date prodExpiryDate) {
		this.prodExpiryDate = prodExpiryDate;
	}

	public String getProdReview() {
		return this.prodReview;
	}

	public void setProdReview(String prodReview) {
		this.prodReview = prodReview;
	}

	public double getProdPrice() {
		return this.prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "ProductInfo [prodId=" + prodId + ", prodName=" + prodName + ", prodBrand=" + prodBrand
				+ ", prodQuantity=" + prodQuantity + ", prodExpiryDate=" + prodExpiryDate + ", prodReview=" + prodReview
				+ ", prodPrice=" + prodPrice + "]";
	}
	
}
