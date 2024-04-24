package com.shopping.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.Entity.CartInfo;
import com.shopping.Repository.CartRepository;
@Component
public class CartInfoDAOImp implements CartInfoDAO{
	@Autowired
	CartRepository cartRepository;
	@Override
	public void saveCustomerInofObj(CartInfo cartInfo) {
		
		cartRepository.save(cartInfo);
	}

}
