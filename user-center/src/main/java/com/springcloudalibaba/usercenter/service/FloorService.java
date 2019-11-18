package com.springcloudalibaba.usercenter.service;

import com.springcloudalibaba.usercenter.domain.dto.BusinessBuildingRoomDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("floor-manager")
public interface FloorService {
    @GetMapping("/floor/list/{userId}")
    List<BusinessBuildingRoomDto> userRoomInfo(@PathVariable String userId);
}
