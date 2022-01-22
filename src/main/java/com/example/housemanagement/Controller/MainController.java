package com.example.housemanagement.Controller;

import com.example.housemanagement.Model.HouseAttri;
import com.example.housemanagement.Repository.UserRepository;
import com.example.housemanagement.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    HouseService houseService;
//    @Autowired
    private UserRepository userRepository;
//    HouseService houseService;
//    @PostMapping(path = "/savehouse")
//    public HouseAttri addUser(@RequestBody HouseAttri house) {
//        userRepository.save(house);
//        return house;
//    }
//
//    @PostMapping(path="/saveHouse")
//    private int saveHouse(@RequestBody HouseAttri houseAttri){
//        houseService.saveOr(houseAttri);
//        return houseAttri.getHouseId();
//    }


    @PostMapping("/saveHouse")
    private int saveHouse(@RequestBody HouseAttri house){
        houseService.saveOrUpdate(house);
        return house.getHouseId();
    }




    @GetMapping("/getByType/{type}")
    private HouseAttri getHouseByType(@PathVariable("type") String type){
        return houseService.getHouseByType(type);
    }

    @DeleteMapping("/deleteHouse/{houseId}")
    private void deleteHouse(@PathVariable("houseId") int houseId){
        houseService.delete(houseId);

    }
    @GetMapping("/getAllHouse")
    private List<HouseAttri> getAllHouse(){
        return houseService.getAllHouse();
    }
    @GetMapping("/getHouse/{id}")
    private HouseAttri getHouseById(@PathVariable("id") int id){
        return houseService.getHouseById(id);
    }
}
