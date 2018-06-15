package com.messenger.services.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger.domain.Data;
import com.messenger.services.data.assembler.DataAssembler;
import com.messenger.services.data.dto.DataDto;
import com.messenger.services.data.repository.DataRepository;
import com.messenger.services.data.service.DataService;

@Service
public class DataServiceImpl implements DataService{
	
	@Autowired
	DataRepository dataRepository;

	@Override
	public DataDto saveData(Data data) {
		return DataAssembler.INSTANCE.dataToDataDto(dataRepository.save(data));
	}

	@Override
	public DataDto getData(Long id) {
		return DataAssembler.INSTANCE.dataToDataDto(dataRepository.findById(id).get());
	}

	@Override
	public DataDto updateData(Data data) {
		return DataAssembler.INSTANCE.dataToDataDto(dataRepository.save(data));
	}

}
