package com.api.backend.groovey.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.api.backend.groovey.entity.user.User;
import com.api.backend.groovey.repositery.UserRepositery;
import com.api.backend.groovey.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	
	private final UserRepositery userRepositery;
	
	private final BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public User addUser(User user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		
		return userRepositery.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepositery.save(user);
	}

	@Override
	public User getUserById(Long userId) {
		return userRepositery.findById(userId).get();
	}

	@Override
	public boolean deleteUserById(Long userId) {
		 userRepositery.deleteById(userId);
		return true;
	}

}
