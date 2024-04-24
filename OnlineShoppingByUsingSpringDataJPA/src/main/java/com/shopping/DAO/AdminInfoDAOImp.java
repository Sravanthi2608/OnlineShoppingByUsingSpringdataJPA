package com.shopping.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.Entity.AdminInfo;
import com.shopping.Repository.AdminRepository;
@Component
public class AdminInfoDAOImp implements AdminInfoDAO {
	
	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public void saveCustomerInofObj(AdminInfo adminInfo) {
		adminRepository.save(adminInfo);
		
	}

}
