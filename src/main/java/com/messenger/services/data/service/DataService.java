package com.messenger.services.data.service;

import com.messenger.domain.Data;
import com.messenger.services.data.dto.DataDto;

public interface DataService {

	DataDto saveData(Data data);
	
	DataDto getData(Long id);
	
	DataDto updateData(Data data);
}
