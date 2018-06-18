package com.messenger.services.configdata.service;

import com.messenger.domain.ConfigData;
import com.messenger.services.configdata.dto.ConfigDataDto;

public interface ConfigDataService {

	ConfigDataDto getConfigData(Long id);
	
	ConfigDataDto saveConfigData(ConfigData configData);
}
