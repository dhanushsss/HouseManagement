package com.example.housemanagement.Controller;

import com.example.housemanagement.Model.HouseAttri;
import com.example.housemanagement.Repository.UserRepository;
import com.example.housemanagement.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/all")
public class MainController {
    @Autowired
    private UserRepository userRepository;
    HouseService houseService;
//    @PostMapping(path = "/savehouse")
//    public HouseAttri addUser(@RequestBody HouseAttri house) {
//        userRepository.save(house);
//        return house;
//    }
//
//    @GetMapping(path = "/find")
//    public Iterable<HouseAttri> getUser() {
//        Iterable<HouseAttri> list = userRepository.findAll();
//        return list;
//    }

    @PostMapping(path="/saveHouse")
    private int saveHouse(@RequestBody HouseAttri houseAttri){
        houseService.saveOr(houseAttri);
        return houseAttri.getHouseId();
    }

    @GetMapping(path = "/getByType/{type}")
    private HouseAttri getHouseType (@PathVariable("type")String type){
        return houseService.gethouseByType(type);
    }
    @DeleteMapping("/deleteHouse/{houseId}")
    private void deleteHouse (@PathVariable("houseId")int houseId){
        houseService.delete(houseId);
    }
    @GetMapping("/getAllHouse")
    private List<HouseAttri> getAllHouse (){
        return houseService.getAllHouse();
    }
    @GetMapping("/getById/{id}")
    private HouseAttri getHouseById(@PathVariable("id")int id){
        return houseService.getHouseById(id);
    }
}