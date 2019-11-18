package com.springcloud.carcenter.controller;

import com.springcloud.carcenter.entity.BusinessParkingSpace;
import com.springcloud.carcenter.service.ParkingSpaceService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/park")
public class ParkingSpaceController {
    @Resource
    ParkingSpaceService parkingSpaceService;
    @RequestMapping("/park")
    public BusinessParkingSpace getPark(String psId){
        BusinessParkingSpace parkSpace = parkingSpaceService.getParkSpace(psId);
        return parkSpace;
    }
    @RequestMapping("/userPark/{userId}")
    public List<BusinessParkingSpace>getUserPark( @PathVariable String userId){
        List<BusinessParkingSpace> userAllParkSpace = parkingSpaceService.getUserAllParkSpace(userId);
        return userAllParkSpace;
    }
}
