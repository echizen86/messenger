package com.messenger.services.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger.domain.User;
import com.messenger.services.user.assembler.UserAssembler;
import com.messenger.services.user.dto.UserDto;
import com.messenger.services.user.repository.UserRepository;
import com.messenger.services.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto saveUser(User user) {
		return UserAssembler.INSTANCE.userToUserDto(userRepository.save(user));
	}

	@Override
	public UserDto updateUser(User user) {
		return UserAssembler.INSTANCE.userToUserDto(userRepository.save(user));
	}

	@Override
	public UserDto getUser(Long id) {
		return UserAssembler.INSTANCE.userToUserDto(userRepository.findById(id).get());
	}

}
