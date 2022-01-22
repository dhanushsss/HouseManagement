package com.example.housemanagement.Service;

import com.example.housemanagement.Model.HouseAttri;
import com.example.housemanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    @Autowired
    UserRepository userRepository;
    public List<HouseAttri> getAllHouse(){
        List<HouseAttri> houses=new ArrayList<>();
        userRepository.findAll().forEach(house->houses.add(house));
        return houses;
    }
    public HouseAttri gethouseByType(String type){
        int id = Integer.parseInt(type);
        return userRepository.findById(id).get();
    }
    public void delete (int houseId){
        userRepository.deleteById(houseId);
    }
    public void saveOr(HouseAttri houseAttri){
        userRepository.save(houseAttri);
    }
    public HouseAttri getHouseById(int houseId){
        return userRepository.findById(houseId).get();
    }
}
