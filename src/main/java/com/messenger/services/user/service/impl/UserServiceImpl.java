package com.messenger.services.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger.controller.request.UserRequest;
import com.messenger.domain.User;
import com.messenger.services.user.assembler.UserAssembler;
import com.messenger.services.user.dto.UserDto;
import com.messenger.services.user.repository.UserRepository;
import com.messenger.services.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto saveUser(UserRequest userRequest) {
		User user = new User();
		user.setData(userRequest.getData());
		user.setName(userRequest.getName());
		userRepository.save(user);
		return UserAssembler.INSTANCE.userToUserDto(userRepository.save(user));
	}

	@Override
	public UserDto updateUser(UserRequest userRequest) {
		User user = new User();
		user.setData(userRequest.getData());
		user.setName(userRequest.getName());
		user.setId(userRequest.getId());
		user = userRepository.save(user);
		return UserAssembler.INSTANCE.userToUserDto(userRepository.save(user));
	}

	@Override
	public UserDto getUser(Long id) {
		return UserAssembler.INSTANCE.userToUserDto(userRepository.findById(id).get());
	}

	@Override
	public List<UserDto> getUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		List<UserDto> getUsersDto = new ArrayList<>(users.size());
		for (User user : users) {
			getUsersDto.add(UserAssembler.INSTANCE.userToUserDto(user));
		}
		return getUsersDto;
	}

	@Override
	public boolean deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

}
