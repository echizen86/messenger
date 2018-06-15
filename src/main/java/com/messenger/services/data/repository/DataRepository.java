package com.messenger.services.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.messenger.domain.Data;

public interface DataRepository extends CrudRepository<Data, Long> {

}
