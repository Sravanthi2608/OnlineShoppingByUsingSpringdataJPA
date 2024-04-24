package com.shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.Entity.AdminInfo;

public interface AdminRepository extends JpaRepository<AdminInfo, Integer> {

}
