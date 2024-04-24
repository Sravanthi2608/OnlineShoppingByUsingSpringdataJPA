package com.shopping.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.Entity.CustomerInfo;
import com.shopping.Repository.CustomerRepsitory;
import com.shopping.exception.NoIdFound;

@Component
public class CustomerInfoDAOImp implements CustomerInfoDAO {

	@Autowired
	CustomerRepsitory customerRepository;

	@Override
	public void saveCustomerInofObj(CustomerInfo customerInfo) {
		customerRepository.save(customerInfo);

	}

	@Override
	public void getCustomerDetailsById(int id) {
		// Optional class
//		Optional<CustomerInfo> optional = customerRepsitory.findById(id);
//		System.out.println(optional);

		// get() method is used to give CustomerInfo Obj
//		try {
//			CustomerInfo customerInfo = customerRepsitory.findById(id).get();
//			System.out.println(customerInfo.getCustomerName());
//			System.out.println(customerInfo.getCustomerEmailId());
//		} catch (Exception e) {
//			System.out.println("No Obj Found");
//		}

		// isPresent() gives true/false
//		boolean b = customerRepository.findById(id).isPresent();
//		System.out.println(b);

		// orEsle()
//		CustomerInfo customerInfo = customerRepository.findById(id).orElse(new CustomerInfo());
//		if(customerInfo.getCustomerEmailId()!=null) {
//			System.out.println(customerInfo);
//		}
//		else {
//			System.out.println("No obj found");
//		}

		// Using Exception
//		CustomerInfo customerInfo = customerRepository.findById(id).orElseThrow(()-> new NoIdFound("No Obj Found"));
//		System.out.println(customerInfo);
	}

	@Override
	public void getAllCustomerDetails() {
		//Without Using List Objrv
		customerRepository.findAll().forEach((customerInfo)->{
			System.out.println("Cust Name: " + customerInfo.getCustomerName());
			System.out.println("Cust EmailId: " + customerInfo.getCustomerEmailId());
			System.out.println("Cust Password: " + customerInfo.getCustomerPassword());
			System.out.println("Cust Mobile num: " + customerInfo.getCustomerMobileNum());
			System.out.println("Cust Address: " + customerInfo.getCustomerAddress());
			System.out.println("********************************");
		});
								/*OR*/
//		//using list objrv
//		List<CustomerInfo> all = customerRepository.findAll();
//		//For Each Method
//		all.forEach((customerInfo)->{
//			System.out.println("Cust Name: " + customerInfo.getCustomerName());
//			System.out.println("Cust EmailId: " + customerInfo.getCustomerEmailId());
//			System.out.println("Cust Password: " + customerInfo.getCustomerPassword());
//			System.out.println("Cust Mobile num: " + customerInfo.getCustomerMobileNum());
//			System.out.println("Cust Address: " + customerInfo.getCustomerAddress());
//			System.out.println("********************************");
//		});
		//For Each Loop
//		for (CustomerInfo customerInfo : all) {
//
//			System.out.println("Cust Name: " + customerInfo.getCustomerName());
//			System.out.println("Cust EmailId: " + customerInfo.getCustomerEmailId());
//			System.out.println("Cust Password: " + customerInfo.getCustomerPassword());
//			System.out.println("Cust Mobile num: " + customerInfo.getCustomerMobileNum());
//			System.out.println("Cust Address: " + customerInfo.getCustomerAddress());
//			System.out.println("********************************");
//
//		}

	}

	@Override
	public void updatePassword(int id) {
		CustomerInfo customerInfo = customerRepository.findById(id).orElse(new CustomerInfo());
		if(customerInfo.getCustomerId()!=null) {
			customerInfo.setCustomerPassword("51437");
			customerRepository.save(customerInfo);
		}
		
	}

	@Override
	public void deleteCustomerDetails(int id) {
		CustomerInfo customerInfo = customerRepository.findById(id).orElse(new CustomerInfo());
		if(customerInfo.getCustomerId()!=null) {
			customerRepository.delete(customerInfo);
			System.out.println("Customer Obj deleted");
		}
		else {
			System.out.println("No Obj Found");
		}
		
	}

	@Override
	public void customerLogin(String emailid, String password) {
		CustomerInfo customerInfo = customerRepository.findByCustomerEmailIdAndCustomerPassword(emailid, password);
		
		System.out.println(customerInfo);
	}

	@Override
	public void getDetailsByMobileNum(String mobilenum) {
		CustomerInfo customerInfo = customerRepository.getByCustomerMobileNum(mobilenum);
		if(customerInfo.getCustomerMobileNum()!=null) {
			System.out.println(customerInfo);
		}
		else {
			System.out.println("No Obj Found");
		}
		
		
	}

	@Override
	public void readDetailsByPassword(String password) {
		CustomerInfo customerInfo = customerRepository.readByCustomerPassword(password);
		if(customerInfo.getCustomerPassword()!=null) {
			System.out.println(customerInfo);
		}
		else {
			System.out.println("No Obj Found");
		}
	}

}
