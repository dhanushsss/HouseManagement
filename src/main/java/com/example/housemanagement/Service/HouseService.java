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




//    public HouseAttri getHouseByType(String type){
//        return userRepository.findById();
//    }


    public void delete(int houseId){
        userRepository.deleteById(houseId);
    }



    public void saveOrUpdate(HouseAttri house){
        userRepository.save(house);
    }




    public HouseAttri getHouseById(int houseId){
        return userRepository.findById(houseId).get();
    }
}
