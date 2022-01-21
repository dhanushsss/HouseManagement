package com.example.housemanagement.Controller;

import com.example.housemanagement.Model.HouseAttri;
import com.example.housemanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping(path = "/all")
    public class MainController {
        @Autowired
        private UserRepository userRepository;
        @PostMapping(path = "/savehouse")
        public HouseAttri addUser(@RequestBody HouseAttri house) {
            userRepository.save(house);
            return house;
        }
    @GetMapping (path = "/find")
    public Iterable<HouseAttri> getUser(){
        Iterable<HouseAttri> list = userRepository.findAll();
        return list;
    }
}




