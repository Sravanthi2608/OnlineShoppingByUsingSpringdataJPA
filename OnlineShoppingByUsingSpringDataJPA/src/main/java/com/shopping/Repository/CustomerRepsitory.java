package com.shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.Entity.CustomerInfo;

public interface CustomerRepsitory extends JpaRepository<CustomerInfo, Integer>{
/*	In spring data JPA we are having the flexibility to create our own methods for database operation
	To create the selection operation methods we make use of keys
	1)findBy
	2)readBy
	3)getBy
	for this keys we are going to Concat the entity class variables by following
	pascal casing.for that key and variables we can add the Logical operators,
	relational operators,ect.. follows Pascal casing.|
	*/
	
	CustomerInfo findByCustomerEmailIdAndCustomerPassword(String emailid,String password);
	CustomerInfo getByCustomerMobileNum(String mobilenum);
	CustomerInfo readByCustomerPassword(String password);
}
