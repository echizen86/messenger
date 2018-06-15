package com.messenger.services.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.messenger.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
