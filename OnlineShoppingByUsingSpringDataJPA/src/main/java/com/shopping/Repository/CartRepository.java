package com.shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.Entity.CartInfo;

public interface CartRepository extends JpaRepository<CartInfo, Integer>{

}
