package com.springcloudalibaba.floormanager.controller;

import com.springcloudalibaba.floormanager.domian.entity.BusinessBuildingRoom;
import com.springcloudalibaba.floormanager.service.FloorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author www
 */
@RestController
@RequestMapping("/floor")
public class FloorController {
    @Resource
    FloorService floorService;
@RequestMapping("/list/{userId}")
    public List<BusinessBuildingRoom> getList(@PathVariable String userId) {
    List<BusinessBuildingRoom> getlist = floorService.getlist(userId);
    return getlist;
    }
}
