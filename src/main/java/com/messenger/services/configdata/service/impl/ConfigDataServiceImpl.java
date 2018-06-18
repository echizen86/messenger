package com.messenger.services.configdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger.controller.request.ConfigDataRequest;
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
		return ConfigDataAssembler.toConfigDataDto(configDataRepository.findById(id).get());
	}

	@Override
	public ConfigDataDto saveConfigData(ConfigDataRequest configData) {
		ConfigData data = new ConfigData();
		data.setHost(configData.getHost());
		data.setPort(configData.getPort());
		return ConfigDataAssembler.toConfigDataDto(configDataRepository.save(data));
	}

}
