package com.messenger.controller;

import java.util.HashSet;
import java.util.List;

import javax.print.attribute.HashAttributeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.messenger.controller.request.UserRequest;
import com.messenger.services.user.dto.UserDto;
import com.messenger.services.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.POST) /// todo este metodo es un endpoint
	public @ResponseBody UserDto saveUser(@RequestBody UserRequest userRequest) {
		return userService.saveUser(userRequest);
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	private UserDto updateUser(@RequestBody UserRequest userRequest) {
		return userService.updateUser(userRequest);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	private UserDto getUser(@PathVariable Integer id) {
		Long long1 = new Long(id);
		return userService.getUser(long1);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	private @ResponseBody List<UserDto> getUsers() {
		return userService.getUsers();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

}
