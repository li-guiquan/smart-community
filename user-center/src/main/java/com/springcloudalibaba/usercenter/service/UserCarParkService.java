package com.springcloudalibaba.usercenter.service;

import com.springcloudalibaba.usercenter.domain.dto.BusinessOwnerCarDto;
import com.springcloudalibaba.usercenter.domain.dto.BusinessParkingSpanceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author www
 */
@FeignClient("car-center")
public interface UserCarParkService {
    @GetMapping("/park/userPark/{userId}")
    List<BusinessParkingSpanceDto> userPark(@PathVariable String userId);

    @GetMapping("/car/list/{userId}")
    List<BusinessOwnerCarDto> userCarInfo(@PathVariable String userId);
}
