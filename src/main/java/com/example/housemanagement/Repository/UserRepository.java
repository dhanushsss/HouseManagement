package com.example.housemanagement.Repository;

import com.example.housemanagement.Model.HouseAttri;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<HouseAttri, Integer>{
}

