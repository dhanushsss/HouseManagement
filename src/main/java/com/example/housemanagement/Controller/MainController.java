package com.example.housemanagement.Controller;

import com.example.housemanagement.Model.HouseAttri;
import com.example.housemanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/alll")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/savehouse")
    public @ResponseBody String addUser(@RequestParam int houseId, @RequestParam int houseNo, @RequestParam String status,
                                        @RequestParam String type) {
        HouseAttri Data = new HouseAttri();
        Data.setHouseId(houseId);
        Data.setHouseNo(houseNo);
        Data.setStatus(status);
        Data.setType(type);

        userRepository.save(Data);
        return "HouseAttri{" +
                "houseId=" + houseId +
                ", houseNo=" + houseNo +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @GetMapping (path = "/Id")
    public @ResponseBody Iterable<HouseAttri> getUser(){
        return userRepository.findAll();
    }
}


