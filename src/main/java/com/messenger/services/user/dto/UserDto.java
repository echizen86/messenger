package com.messenger.services.user.dto;

import com.messenger.domain.Data;

public class UserDto {

	private Long id;
	
	private String name;
	
	private Data data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
}
