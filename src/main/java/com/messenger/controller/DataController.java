package com.messenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.messenger.controller.request.DataRequest;
import com.messenger.services.data.dto.DataDto;
import com.messenger.services.data.service.DataService;

@RestController
public class DataController {
	
	@Autowired
	private DataService dataService;
	
	@RequestMapping(value = "/data", method = RequestMethod.POST) /// todo este metodo es un endpoint
	public @ResponseBody DataDto saveUser(@RequestBody DataRequest dataRequest) {
		return dataService.saveData(dataRequest);
	}

	@RequestMapping(value = "/data", method = RequestMethod.PUT)
	public DataDto updateUser(@RequestBody DataRequest dataRequest) {
		return dataService.updateData(dataRequest);
	}
	
	@RequestMapping(value = "/data/{id}", method = RequestMethod.GET)
	public DataDto getUser(@PathVariable Integer id) {
		Long long1 = new Long(id);
		return dataService.getData(long1);
	}
}