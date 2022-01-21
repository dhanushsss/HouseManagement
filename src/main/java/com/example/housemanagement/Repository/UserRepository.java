package com.example.housemanagement.Repository;

import org.springframework.data.repository.CrudRepository;
import org.apache.catalina.User;

public interface UserRepository extends CrudRepository<User, Integer>{
}

