package com.messenger.services.configdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger.domain.ConfigData;
import com.messenger.services.configdata.assembler.ConfigDataAssembler;
import com.messenger.services.configdata.dto.ConfigDataDto;
import com.messenger.services.configdata.repository.ConfigDataRepository;
import com.messenger.services.configdata.service.ConfigDataService;

@Service
public class ConfigDataServiceImpl implements ConfigDataService{
	
	@Autowired
	private ConfigDataRepository configDataRepository;

	@Override
	public ConfigDataDto getConfigData(Long id) {
		return ConfigDataAssembler.INSTANCE.ConfigDataToConfigDataDto(configDataRepository.findById(id).get());
	}

	@Override
	public ConfigDataDto saveConfigData(ConfigData configData) {
		return ConfigDataAssembler.INSTANCE.ConfigDataToConfigDataDto(configDataRepository.save(configData));
	}

}
