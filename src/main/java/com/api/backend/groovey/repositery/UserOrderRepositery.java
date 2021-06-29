package com.api.backend.groovey.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.backend.groovey.entity.user.UserOrder;

@Repository
public interface UserOrderRepositery extends JpaRepository<UserOrder, Long>{

}
