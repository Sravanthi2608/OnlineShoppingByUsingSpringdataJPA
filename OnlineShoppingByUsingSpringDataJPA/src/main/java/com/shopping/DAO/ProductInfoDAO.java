package com.shopping.DAO;

import com.shopping.Entity.ProductInfo;

public interface ProductInfoDAO {
	void saveCustomerInofObj(ProductInfo productInfo);
	void updateProductPrice(int id);
	void deleteProductDetails(int id);
	void getProductDetailsByUsingPrice(double price);
	void readTheProductDetailsByChar(char ch);
	void getProductDetailsByUsingQuantity(int q);
	void getProductDetailsByUsingReview(int num);
	
}
