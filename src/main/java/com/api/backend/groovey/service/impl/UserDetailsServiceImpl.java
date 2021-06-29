package com.api.backend.groovey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.api.backend.groovey.entity.user.User;
import com.api.backend.groovey.repositery.UserRepositery;
import com.api.backend.groovey.util.CustomUserDetails;

import lombok.AllArgsConstructor;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepositery userRepositery;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		
		User findByUsername = userRepositery.findByUsername(username);
		
		if(findByUsername==null)
			throw new UsernameNotFoundException("user not found..");
		else 
			return new CustomUserDetails(findByUsername);
			
		
	}

}
