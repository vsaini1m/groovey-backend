package com.api.backend.groovey.service;

import com.api.backend.groovey.entity.user.User;

public interface UserService {
	
	User addUser(User user);	

	User updateUser(User user);

	User getUserById(Long userId);
	
	boolean deleteUserById(Long userId);
	
	
	
}
