package com.springcloudalibaba.usercenter.service;

import com.springcloudalibaba.usercenter.domain.dto.BusinessBuildingOwnerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("person-manager")
public interface OwnerService {

    @GetMapping("/owner/info/{userId}")
    List<BusinessBuildingOwnerDto> getListInfo(@PathVariable String userId);
}
