package com.messenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.messenger.controller.request.ConfigDataRequest;
import com.messenger.services.configdata.dto.ConfigDataDto;
import com.messenger.services.configdata.service.ConfigDataService;

@RestController
public class ConfigDataController {

	@Autowired
	private ConfigDataService configDataService;
	
	@RequestMapping(value = "/config-data", method = RequestMethod.POST)
	public @ResponseBody ConfigDataDto saveConfigData(@RequestBody ConfigDataRequest configData) {
		return configDataService.saveConfigData(configData);
	}
}
