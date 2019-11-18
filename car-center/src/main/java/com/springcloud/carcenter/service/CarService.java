package com.springcloud.carcenter.service;

import com.springcloud.carcenter.entity.BusinessOwnerCar;

import java.util.List;

public interface CarService {
    List<BusinessOwnerCar> getUserAllCar(String userId);
}
