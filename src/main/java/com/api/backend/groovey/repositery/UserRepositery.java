package com.api.backend.groovey.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.backend.groovey.entity.user.User;
@Repository
public interface UserRepositery extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
