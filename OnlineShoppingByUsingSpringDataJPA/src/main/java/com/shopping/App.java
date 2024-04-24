package com.shopping;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shopping.DAO.CustomerInfoDAO;
import com.shopping.DAO.ProductInfoDAO;
import com.shopping.Entity.ProductInfo;
import com.shopping.config.OnlineShoppingConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(OnlineShoppingConfig.class);
//        CustomerInfo customerInfo = new CustomerInfo();
//        customerInfo.setCustomerName("Loki");
//        customerInfo.setCustomerEmailId("loki@gmail.com");
//        customerInfo.setCustomerPassword("12345");
//        customerInfo.setCustomerMobileNum("6309583987");
//        customerInfo.setCustomerAddress("Vijayawada");
//        CustomerInfoDAO customerInfoDAO = context.getBean("customerInfoDAOImp",CustomerInfoDAO.class);
//        customerInfoDAO.saveCustomerInofObj(customerInfo);

//        ProductInfo productInfo = new ProductInfo();
//        productInfo.setProdName("Samsung");
//        productInfo.setProdBrand("Samsung s22+");
//        productInfo.setProdQuantity(1);
//        productInfo.setProdExpiryDate(Date.valueOf(LocalDate.now()));
//        productInfo.setProdReview("Excellent product...!!");
//        productInfo.setProdPrice(50000.211);
//        ProductInfoDAO productInfoDAO = context.getBean("productInfoDAOImp",ProductInfoDAO.class);
//        productInfoDAO.saveCustomerInofObj(productInfo);

//        AdminInfo admininfo = new AdminInfo();
//        admininfo.setAdminEmailId("loki@gmail.com");
//        admininfo.setAdminPassword("12345");
//        AdminInfoDAO adminInfoDAO = context.getBean(AdminInfoDAO.class);
//        adminInfoDAO.saveCustomerInofObj(admininfo);

//        CartInfo cartInfo = new CartInfo();
//        cartInfo.setProductName("Samsung");
//        cartInfo.setProductPrice(50000.123);
//        cartInfo.setProductBrand("Samsung s22+");
//        cartInfo.setCustomerId(1);
//        CartInfoDAO cartInfoDAO = context.getBean(CartInfoDAO.class);
//        cartInfoDAO.saveCustomerInofObj(cartInfo);

//        CustomerInfoDAO customerInfoDAO = context.getBean(CustomerInfoDAO.class);
//        try {
//        	customerInfoDAO.getCustomerDetailsById(2);
//		} catch (NoIdFound e) {
//			System.out.println(e.getMessage());
//		}

//		CustomerInfoDAO customerInfoDAO = context.getBean(CustomerInfoDAO.class);
//		customerInfoDAO.getAllCustomerDetails();
		
//		ProductInfoDAO productInfoDAO = context.getBean("productInfoDAOImp",ProductInfoDAO.class);
//		productInfoDAO.updateProductPrice(1);
		
//		CustomerInfoDAO customerInfoDAO = context.getBean(CustomerInfoDAO.class);
//		customerInfoDAO.updatePassword(2);
		
//		CustomerInfoDAO customerInfoDAO = context.getBean(CustomerInfoDAO.class);
//		customerInfoDAO.deleteCustomerDetails(3);
		
//		ProductInfoDAO productInfoDAO = context.getBean("productInfoDAOImp",ProductInfoDAO.class);
//		productInfoDAO.deleteProductDetails(2);
		
//		CustomerInfoDAO customerInfoDAO = context.getBean(CustomerInfoDAO.class);
		//customerInfoDAO.customerLogin("loki@gmail.com","12345");
		//customerInfoDAO.getDetailsByMobileNum("6309583987");
//		customerInfoDAO.readDetailsByPassword("12345");
		
		ProductInfoDAO productInfoDAO = context.getBean("productInfoDAOImp",ProductInfoDAO.class);
		//productInfoDAO.getProductDetailsByUsingPrice(100000);
		//productInfoDAO.readTheProductDetailsByChar('s');
		//productInfoDAO.getProductDetailsByUsingQuantity(1);;
		productInfoDAO.getProductDetailsByUsingReview(3);;
	}
}
