package com.shopping.DAO;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.Entity.ProductInfo;
import com.shopping.Repository.ProductRepository;


@Component
public class ProductInfoDAOImp implements ProductInfoDAO{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void saveCustomerInofObj(ProductInfo productInfo) {
		productRepository.save(productInfo);
		
	}

	@Override
	public void updateProductPrice(int id) {
		ProductInfo productInfo = productRepository.findById(id).orElse(new ProductInfo());
		if(productInfo.getProdId()!=null) {
			productInfo.setProdPrice(48000);
			productRepository.save(productInfo);
		}
		else {
			System.out.println("No Obj Found");
		}
		
	}

	@Override
	public void deleteProductDetails(int id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public void getProductDetailsByUsingPrice(double price) {
		List<ProductInfo> productInfo = productRepository.getByProdPriceLessThan(price);
		System.out.println(productInfo);
		
	}

	@Override
	public void readTheProductDetailsByChar(char ch) {
		List<ProductInfo> productInfo = productRepository.readByProdNameContains(ch);
		System.out.println(productInfo);

	}

	@Override
	public void getProductDetailsByUsingQuantity(int q) {
		List<ProductInfo> productInfo = productRepository.getByProdQuantityGreaterThanEqual(q);
		System.out.println(productInfo);
		
	}

	@Override
	public void getProductDetailsByUsingReview(int num) {
		List<ProductInfo> productInfo = productRepository.getByProdReviewGreaterThan(num);
		for (ProductInfo productInfo2 : productInfo) {
			if(productInfo2.getProdReview().length()>num) {
				System.out.println(productInfo);	
			}
			else {
				System.out.println("No obj Found");
			}
		}
		System.out.println(productInfo);	
	}
	
}
