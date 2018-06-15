package com.messenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.messenger.domain.Email;
import com.messenger.services.email.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(path = "/email-send", method = RequestMethod.GET)
    public boolean sendMail(Email email) {
		return emailService.SendEmail(email);
	}
	
}