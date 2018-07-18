package com.messenger.services.user.service;

import java.util.List;

import com.messenger.controller.request.UserRequest;
import com.messenger.domain.User;
import com.messenger.services.user.dto.UserDto;

public interface UserService {
	
	UserDto saveUser(UserRequest userRequest);
	
	UserDto updateUser(UserRequest userRequest);
	
	UserDto getUser(Long id);

	List<UserDto> getUsers();

	boolean deleteUser(Long id);
}
