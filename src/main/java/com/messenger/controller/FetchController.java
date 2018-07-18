package com.messenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.messenger.services.email.dto.EmailDto;
import com.messenger.services.fetch.service.FetchService;


@RestController
public class FetchController {
	
	@Autowired
	FetchService fetchService;
	
	@RequestMapping(value = "/mail", method = RequestMethod.GET)
	public @ResponseBody List<EmailDto> getmail() {
		
		return fetchService.receiveMail();

	}

}
