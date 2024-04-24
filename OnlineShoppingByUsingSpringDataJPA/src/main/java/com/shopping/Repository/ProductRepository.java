package com.shopping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.Entity.ProductInfo;

public interface ProductRepository extends JpaRepository<ProductInfo, Integer>{
	List<ProductInfo> getByProdPriceLessThan(double price);
	List<ProductInfo> readByProdNameContains(char ch);
	List<ProductInfo> getByProdQuantityGreaterThanEqual(int q);
	List<ProductInfo> getByProdReviewGreaterThan(int num);
	
	
}
