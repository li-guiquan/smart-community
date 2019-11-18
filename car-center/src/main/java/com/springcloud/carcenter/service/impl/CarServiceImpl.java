package com.springcloud.carcenter.service.impl;

import com.springcloud.carcenter.entity.BusinessOwnerCar;
import com.springcloud.carcenter.mapper.BusinessOwnerCarMapper;
import com.springcloud.carcenter.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author www
 */
@Service
public class CarServiceImpl implements CarService {
    @Resource
    BusinessOwnerCarMapper carMapper;
    @Override
    public List<BusinessOwnerCar> getUserAllCar(String userId) {
        List<BusinessOwnerCar> businessOwnerCars = carMapper.selectByUserId(userId);
        return businessOwnerCars;
    }
}
