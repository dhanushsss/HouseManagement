package com.example.housemanagement.Service;

import com.example.housemanagement.Model.HouseAttri;
import com.example.housemanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HouseService {

    @Autowired
    UserRepository userRepository;

    public List<HouseAttri> getAllHouse(){
        List<HouseAttri> houses=new ArrayList<>();
        userRepository.findAll().forEach(house->houses.add(house));
        return houses;
    }
    public void saveOrUpdate(HouseAttri house){
        userRepository.save(house);
    }
    public HouseAttri getHouseByType(String type){
        int id = Integer.valueOf(type);
        return userRepository.findById(id).get();
    }

    public void getDelete(int houseId){
         userRepository.deleteById(houseId);
    }

    public HouseAttri getHouseById(int houseId){
        return userRepository.findById(houseId).get();
    }
}
