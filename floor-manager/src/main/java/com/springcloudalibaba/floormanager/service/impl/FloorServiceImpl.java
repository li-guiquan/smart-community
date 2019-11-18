package com.springcloudalibaba.floormanager.service.impl;

import com.springcloudalibaba.floormanager.domian.entity.BusinessBuildingRoom;
import com.springcloudalibaba.floormanager.mapper.BusinessBuildingRoomMapper;
import com.springcloudalibaba.floormanager.service.FloorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FloorServiceImpl implements FloorService {
    @Resource
    BusinessBuildingRoomMapper businessBuildingRoomMapper;
    @Override
    public List<BusinessBuildingRoom> getlist(String userId) {
        List<BusinessBuildingRoom> rooms = businessBuildingRoomMapper.selectList(userId);
        return rooms;
    }
}
