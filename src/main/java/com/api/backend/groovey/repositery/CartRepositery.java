package com.api.backend.groovey.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.backend.groovey.entity.user.Cart;

@Repository
public interface CartRepositery extends JpaRepository<Cart, Long>{

}
