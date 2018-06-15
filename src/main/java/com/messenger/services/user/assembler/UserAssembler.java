package com.messenger.services.user.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.messenger.domain.User;
import com.messenger.services.user.dto.UserDto;

@Mapper
public interface UserAssembler {
	
	UserAssembler INSTANCE = Mappers.getMapper(UserAssembler.class);
	
	UserDto userToUserDto(User entity);
}
