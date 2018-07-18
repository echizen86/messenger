package com.messenger.services.configdata.assembler;

import com.messenger.domain.ConfigData;
import com.messenger.services.configdata.dto.ConfigDataDto;

public interface ConfigDataAssembler {
	
	static public ConfigDataDto toConfigDataDto(ConfigData data) {
		ConfigDataDto dto = new ConfigDataDto();
		dto.setId(data.getId());
		dto .setHost(data.getHost());
		dto.setPort(data.getPort());
		
		return dto;
	}
	
}
