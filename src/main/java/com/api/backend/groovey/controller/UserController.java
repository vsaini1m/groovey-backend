package com.api.backend.groovey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.backend.groovey.entity.user.User;
import com.api.backend.groovey.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping("/")
	public User addUser(@RequestBody User user) {

		return userService.addUser(user);

	}

	@PutMapping("/")
	public User updateUser(@RequestBody User user) {

		return userService.updateUser(user);

	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long userId) {

		return userService.getUserById(userId);

	}

	@DeleteMapping("/{id}")
	public boolean deleteUser(@PathVariable("id") Long userId) {

		return userService.deleteUserById(userId);

	}

}
