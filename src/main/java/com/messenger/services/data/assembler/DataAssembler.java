package com.messenger.services.data.assembler;

import com.messenger.domain.Data;
import com.messenger.services.data.dto.DataDto;

public interface DataAssembler {
	
	static public DataDto toDataDto(Data data) {
		DataDto dto = new DataDto();
		dto.setId(data.getId());
		dto.setHost(data.getHost());
		dto.setPort(data.getPort());
		dto.setUsername(data.getUsername());
		dto.setPassword(data.getPassword());
		
		return dto;
	}
	
}
