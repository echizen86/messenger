package com.messenger.services.email.service.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.messenger.domain.Email;
import com.messenger.services.email.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private  JavaMailSender mailSender;

	@Override
	public boolean SendEmail(Email email) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setText(email.getText());
		msg.setFrom(email.getFrom());
		msg.setTo(email.getTo());
		msg.setSubject("CM " + email.getUser().getName());
		
		mailSender.send(msg);
		return true;
	}

}
