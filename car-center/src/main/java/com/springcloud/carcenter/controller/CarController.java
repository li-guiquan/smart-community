package com.springcloud.carcenter.controller;

import com.springcloud.carcenter.entity.BusinessOwnerCar;
import com.springcloud.carcenter.service.CarService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author www
 */
@RestController
@RequestMapping("/car")
public class CarController {
    @Resource
    CarService carService;
    @RequestMapping("/list/{userId}")
    public List<BusinessOwnerCar> list( @PathVariable String userId){
        return carService.getUserAllCar(userId);
    }
}
