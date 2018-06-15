package com.messenger.services.user.service;

import com.messenger.domain.User;
import com.messenger.services.user.dto.UserDto;

public interface UserService {
	
	UserDto saveUser(User user);
	
	UserDto updateUser(User user);
	
	UserDto getUser(Long id);
}
