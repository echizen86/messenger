package com.messenger.services.data.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.messenger.domain.Data;
import com.messenger.services.data.dto.DataDto;

@Mapper
public interface DataAssembler {
	
	DataAssembler INSTANCE = Mappers.getMapper(DataAssembler.class);
	
	DataDto dataToDataDto(Data entity);

}
