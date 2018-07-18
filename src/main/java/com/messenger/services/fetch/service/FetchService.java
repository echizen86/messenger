package com.messenger.services.fetch.service;

import java.util.List;

import com.messenger.services.email.dto.EmailDto;

public interface FetchService {

	List<EmailDto> receiveMail();

}
