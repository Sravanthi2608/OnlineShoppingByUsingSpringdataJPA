package com.shopping.Entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AdminInfo
 *
 */
@Entity

public class AdminInfo implements Serializable {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminID;
	@Column(name = "Admin_Email_Id",unique = true,nullable = false,length = 30)
	private String adminEmailId;
	@Column(name = "Admin_Password",nullable = false,length = 8)
	private String adminPassword;
	private static final long serialVersionUID = 1L;

	public AdminInfo() {
		super();
	}   
	
	public AdminInfo(String adminEmailId, String adminPassword) {
		super();
		this.adminEmailId = adminEmailId;
		this.adminPassword = adminPassword;
	}

	public Integer getAdminID() {
		return this.adminID;
	}

	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}   
	public String getAdminEmailId() {
		return this.adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}   
	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "AdminInfo [adminID=" + adminID + ", adminEmailId=" + adminEmailId + ", adminPassword=" + adminPassword
				+ "]";
	}
   
}
