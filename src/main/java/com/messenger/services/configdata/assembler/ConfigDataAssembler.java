package com.messenger.services.configdata.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.messenger.domain.ConfigData;
import com.messenger.services.configdata.dto.ConfigDataDto;

@Mapper
public interface ConfigDataAssembler {

	ConfigDataAssembler INSTANCE = Mappers.getMapper(ConfigDataAssembler.class);
	
	ConfigDataDto ConfigDataToConfigDataDto(ConfigData entity);
}
