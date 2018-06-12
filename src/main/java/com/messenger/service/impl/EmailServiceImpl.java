package com.messenger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.messenger.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private  JavaMailSender mailSender;

	@Override
	public boolean SendEmail(String to, String from, String text) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setText(text);
		msg.setFrom(from);
		msg.setTo(to);
		
		mailSender.send(msg);
		return true;
	}

}
