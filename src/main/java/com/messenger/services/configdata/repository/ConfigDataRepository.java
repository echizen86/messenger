package com.messenger.services.configdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.messenger.domain.ConfigData;

@Repository
public interface ConfigDataRepository extends CrudRepository<ConfigData, Long>{

}
