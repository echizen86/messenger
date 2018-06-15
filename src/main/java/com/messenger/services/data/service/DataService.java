package com.messenger.services.data.service;

import com.messenger.controller.request.DataRequest;
import com.messenger.services.data.dto.DataDto;

public interface DataService {

	DataDto saveData(DataRequest dataRequest);
	
	DataDto getData(Long id);

	DataDto updateData(DataRequest dataRequest);

	
}
