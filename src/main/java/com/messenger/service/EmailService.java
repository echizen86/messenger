package com.messenger.service;

public interface EmailService {
	
	boolean SendEmail(String to, String from, String text);

}
