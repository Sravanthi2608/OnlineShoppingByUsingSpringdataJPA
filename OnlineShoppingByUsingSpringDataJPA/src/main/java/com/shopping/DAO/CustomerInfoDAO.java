package com.shopping.DAO;

import com.shopping.Entity.CustomerInfo;

public interface CustomerInfoDAO {
	void saveCustomerInofObj(CustomerInfo customerInfo);
	void getCustomerDetailsById(int id);
	void getAllCustomerDetails();
	void updatePassword(int id);
	void deleteCustomerDetails(int id);
	void customerLogin(String emailid,String password);
	void getDetailsByMobileNum(String mobilenum);
	void readDetailsByPassword(String password);
}
/*->findById() is used to check the obj or data by using the id
 *->The return type of findById() is Optional class
 *->If the id is present it is going to store the the obj is optional class
 *->If the id is not present it is going to give empty as a string
 *->If you call the get() which is present in Optional call with the findById()
 *->It is going to get the obj of the class
 *->If the obj is not present it is going to throw Exception called as NoSuchElementException
 *->If that findById() is method chaining  with isPresent() it is going to check the obj is present or not 
 *->If the obj is present it is going to return the true if the obj is not present it is going to return false.
 *->If the findByid() is a method chaining with orElse(new Entity Class Constructor)
 *->If the id is present it is going to give valued obj
 *->If the id is not present it is going to give null valued obj
 *->If findById() is method chaining with orElseThrow() it used to throw the user defined exception
 *->If the obj is not present if the obj is present findById() is going to give valued obj
 */