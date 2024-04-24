package com.shopping.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: CustomerInfo
 *
 */

@Entity
public class CustomerInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	@Column(name = "Customer_Name",nullable = false,length = 25)
	private String customerName;
	@Column(name = "Customer_Email_Id",unique = true,nullable = false,length = 30)
	private String customerEmailId;
	@Column(name = "Customer_Password",unique = true,nullable = false,length = 8)
	private String customerPassword;
	@Column(name = "Customer_Mobile_Num",unique = true,nullable = false,length = 10)
	private String customerMobileNum;
	@Column(name = "Customer_Address",nullable = false,length = 30)
	private String customerAddress;
	private static final long serialVersionUID = 1L;

	public CustomerInfo() {
		super();
	}
	
	public CustomerInfo(String customerName, String customerEmailId, String customerPassword,
			String customerMobileNum, String customerAddress) {
		super();
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.customerPassword = customerPassword;
		this.customerMobileNum = customerMobileNum;
		this.customerAddress = customerAddress;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailId() {
		return this.customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerMobileNum() {
		return this.customerMobileNum;
	}

	public void setCustomerMobileNum(String customerMobileNum) {
		this.customerMobileNum = customerMobileNum;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", customerName=" + customerName + ", customerEmailId="
				+ customerEmailId + ", customerPassword=" + customerPassword + ", customerMobileNum="
				+ customerMobileNum + ", customerAddress=" + customerAddress + "]";
	}

}
